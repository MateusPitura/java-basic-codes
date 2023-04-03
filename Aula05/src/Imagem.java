import javax.swing.*;
import java.awt.*;

public class Imagem extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        Image imagem = new ImageIcon(getClass().getResource("/resources/cat.jpg")).getImage();
        g.drawImage(imagem, 3, 4, this);
    }
    
}
