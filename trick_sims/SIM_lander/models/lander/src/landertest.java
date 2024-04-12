import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class LanderComponentsDisplay extends JFrame {

    public LanderComponentsDisplay() {
        this.setTitle("Lander Component Visualization");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new DrawingPanel());
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new LanderComponentsDisplay();
    }

   class DrawingPanel extends JPanel {
    private ScenePoly[] drawings;

    public DrawingPanel() {
        this.setPreferredSize(new Dimension(800, 600));
        initializeDrawings();
    }

    private void initializeDrawings() {
        drawings = new ScenePoly[21];
        // Already initialized drawingNumber1, continue with the others
        // Drawing Number 2
        drawings[1] = new ScenePoly(new Color(150, 150, 150), 4, new double[]{-0.1, -0.25, 0.25, 0.1},
            new double[]{6.2, 6.0, 6.0, 6.2});
        // Drawing Number 3
        drawings[2] = new ScenePoly(new Color(180, 180, 180), 4, new double[]{-0.58, -0.625, -0.375, -0.42},
            new double[]{-1.0, -1.5, -1.5, -1.0});
        // Drawing Number 4
        drawings[3] = new ScenePoly(new Color(180, 180, 180), 4, new double[]{0.42, 0.375, 0.625, 0.58},
            new double[]{-1.0, -1.5, -1.5, -1.0});
        // Drawing Number 5
        drawings[4] = new ScenePoly(new Color(180, 180, 180), 4, new double[]{-0.08, -0.125, 0.125, 0.08},
            new double[]{-1.0, -1.5, -1.5, -1.0});
        // Continue similarly for remaining polygons
        // Drawing Number 6
        drawings[5] = new ScenePoly(new Color(180, 180, 180), 3, new double[]{-1.0, -1.2, -1.1},
            new double[]{-0.6, -0.6, -0.7});
        // Drawing Number 7
        drawings[6] = new ScenePoly(new Color(180, 180, 180), 3, new double[]{-1.0, -1.2, -1.1},
            new double[]{-0.8, -0.8, -0.7});
        // Drawing Number 8
        drawings[7] = new ScenePoly(new Color(180, 180, 180), 3, new double[]{1.0, 1.2, 1.1},
            new double[]{-0.6, -0.6, -0.7});
        // Drawing Number 9
        drawings[8] = new ScenePoly(new Color(180, 180, 180), 3, new double[]{1.0, 1.2, 1.1},
            new double[]{-0.8, -0.8, -0.7});
        // ... Continue initialization for remaining drawings
        // Example for drawing number 10 (adjusted indexing)
        drawings[9] = new ScenePoly(new Color(200, 200, 200), 6, new double[]{-1.25, -1.2, -1.575, -1.575, -1.45, -1.325},
            new double[]{0.375, -1.125, -1.125, 0.375, 0.875, 0.875});
        // Continue for all other polygons...
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        for (ScenePoly poly : drawings) {
            if (poly != null) {
                poly.draw(g2, centerX, centerY, 20); // Scale set to 20 for visibility
            }
        }
    }
}

}
