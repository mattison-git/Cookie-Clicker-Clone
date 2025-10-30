import java.util.Scanner;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(Window.windowInit(getWindowDimensions()));
        System.out.println(Window.addTextWindow());
    }

    public static Dimension getWindowDimensions() {

        return Toolkit.getDefaultToolkit().getScreenSize();
    }
}
