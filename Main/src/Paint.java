import java.awt.*;
import javax.swing.*;

public class Paint extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        Image image = new ImageIcon(getClass().getResource("/images/cat.jpg")).getImage();
        g.drawImage(image, 3, 4, this);
    }
}