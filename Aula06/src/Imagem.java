import javax.swing.*;
import java.awt.*;

public class Imagem extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        Image imagem = new ImageIcon(getClass().getResource("/resource/person.jpg")).getImage();
        g.drawImage(imagem, 200, 100, this);
    }
}
