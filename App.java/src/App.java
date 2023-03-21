import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class App {
    public static void main(String[] args){
        // componente JFrame
        /*
        JFrame miJFrame = new JFrame("Conversor de moedas");
        miJFrame.setSize(500,300); 

        // componente JPanel
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300, 300);

        // usamos este diseño para centrar los componentes de JPanel
        miJPanel.setLayout(new GridBagLayout());

        // componente JTextField
        JLabel miJLabel = new JLabel();
        miJLabel.setText("Escolha uma opção: ");
        */

        // componente JTextArea
        //JTextArea miJTextArea = new JTextArea(5,20); 
        JComboBox miJComboBox = new JComboBox();
        miJComboBox.addItem("Conversor de moedas");
        miJComboBox.addItem("Conversor de temperatura");
        String[] options = {"Conversor de moedas", "Conversor de temperatura"};
        JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, "");


        // conecta los componentes JLabel y JTextField en JPanel
        //miJPanel.add(miJLabel);
        //miJPanel.add(miJOptionPane);

        // conectar Jpanel a JFrame
        //miJFrame.add(miJPanel);

        // hacer visible JFrame
        //miJFrame.setVisible(true);
    }
}