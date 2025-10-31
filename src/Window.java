import javax.swing.*;
import java.awt.*;

public class Window {

    public static JFrame frame = new JFrame();
    public static int clickCounter = 0;
    public static JLabel label = new JLabel();
    public static boolean showBuilding1 = false;
    public static boolean showBuilding2 = false;
    public static int clicksPerSecond = 0;


    public static String windowInit(Dimension screenSize) {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(screenSize);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setTitle("Window");
        frame.setVisible(true);

        return "Window successfully initialized";
    }



    public static String addTitleWindow() {
        label.setText("Title");
        label.setSize(500, 100);
        label.setFont(new Font("Arial", Font.PLAIN, 48));


        label.setHorizontalAlignment(SwingConstants.CENTER);
        int labelPositionX = (frame.getWidth() - label.getWidth()) / 2;
        int labelPositionY = 0;
        label.setLocation(labelPositionX, labelPositionY);

        frame.add(label);
        refreshWindow();
        return "Texts added successfully";
    }

    public static String addClickButtonWindow() {

        JButton button = new JButton("Click");
        button.setSize(100, 100);
        int buttonPositionX = (frame.getWidth() - button.getWidth()) / 2;
        int buttonPositionY = ((frame.getHeight() - button.getHeight())-100) / 2;
        button.setLocation(buttonPositionX, buttonPositionY);

        button.addActionListener( e -> {
            System.out.println("Clicked");
            clickCounter++;
            incrementCounter();

            if (clickCounter >= 20 && !showBuilding1)
                showBuilding1 = true;
            if (showBuilding1)
                building1();

            if (clickCounter >= 100 && !showBuilding2)
                showBuilding2 = true;
            if (showBuilding2)
                building2();
        });

        frame.add(button);
        refreshWindow();

        return "Sprites added successfully";
    }




        public static void refreshWindow() {
        frame.revalidate();
        frame.repaint();
    }

    public static void incrementCounter() {
        label.setText("Times Clicked: " + Integer.toString(clickCounter));
    }

    public static void building1() {
        JButton building1 = new JButton("Building 1");
        building1.setSize(100, 100);
        building1.setLocation(frame.getWidth() - building1.getWidth(), 0);
        frame.add(building1);
        refreshWindow();

        building1.addActionListener(e -> {
            if (clickCounter >= 20) {
                clicksPerSecond++;
                clickCounter = clickCounter - 20;
                incrementCounter();
            }

        });
    }

    public static void building2() {
        JButton building2 = new JButton("Building 2");
        building2.setSize(100, 100);
        building2.setLocation(frame.getWidth() - building2.getWidth(), 100);
        frame.add(building2);
        refreshWindow();

        building2.addActionListener(e -> {
            if (clickCounter >= 100) {
                clicksPerSecond = clicksPerSecond + 5;
                clickCounter = clickCounter - 100;
                incrementCounter();
            }

        });
    }


}
