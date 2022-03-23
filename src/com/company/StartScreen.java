import javax.swing.*;
import java.awt.*;

public class StartScreen extends JPanel {
    JButton[] numPlayers = new JButton[2];
    JPanel title, selection;
    public StartScreen(){

        //TitleWord made
        title = new JPanel();
        JLabel titleWord = new JLabel("CHESS",SwingConstants.CENTER);
        titleWord.setFont(new Font(Font.SERIF,Font.ITALIC, 100));
        title.setLayout(new BorderLayout());
        title.add(titleWord, BorderLayout.CENTER);
        title.setBackground(GUI.background);

        this.add(title);

    }
}
