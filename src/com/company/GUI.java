import javax.swing.*;
import java.awt.*;

public class GUI {
    JFrame frame;
    JPanel startScreen, gameScreen, endScreen;
    public static Color white = new Color(248,240,227);
    public static Color black = new Color(20,20,20);
    public static Color background;
    public GUI(){
        frame= new JFrame("chess");
        startScreen = new StartScreen();
        frame.add(startScreen);
        frame.setSize(1280,720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(false);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
