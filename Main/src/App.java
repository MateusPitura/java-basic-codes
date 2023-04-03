import javax.swing.*;
import java.awt.event.*;

public class App implements ActionListener{
    JButton button;
    public static void main(String[] args){
        App gui = new App();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        Paint pintar = new Paint();
        button = new JButton("Clique aqui");
        button.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(pintar);
        //frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        button.setText("Fui clicado");
    }
}
