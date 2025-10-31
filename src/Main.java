import java.util.Scanner;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(Window.windowInit(getWindowDimensions()));
        System.out.println(Window.addTitleWindow());
        System.out.println(Window.addClickButtonWindow());
        while(true) {
            Window.clickCounter = Window.clickCounter + Window.clicksPerSecond;
            Window.incrementCounter();


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread interrupted: " + e.getMessage());
                break;
            }

        }
    }

    public static Dimension getWindowDimensions() {

        return Toolkit.getDefaultToolkit().getScreenSize();
    }
}
