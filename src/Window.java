import javax.swing.*;
import java.awt.*;

public class Window {

    public static JFrame frame = new JFrame();

    public static String windowInit(Dimension screenSize) {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(screenSize);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setTitle("Window");
        frame.setVisible(true);

        return "Window successfully initialized";
    }

    public static String addTextWindow() {
        JLabel label = new JLabel();
        label.setText("Title");
        label.setSize(100, 100);
        label.setFont(new Font("Arial", Font.PLAIN, 48));


        label.setHorizontalAlignment(SwingConstants.CENTER);
        int labelPositionX = (frame.getWidth() - label.getWidth()) / 2;
        int labelPositionY = 0;
        label.setLocation(labelPositionX, labelPositionY);

        frame.add(label);
        RefreshWindow();
        return "Sprites added successfully";
    }

    

    public static void RefreshWindow() {
        frame.revalidate();
        frame.repaint();
    }



}
