import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App implements ActionListener{
    JButton button;
    JTextField output;
    JTextField input;
    int anoAtual;

    public static void main(String[] args) {
        App gui = new App();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame("Aula 06");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        button = new JButton("Calcular");
        button.addActionListener(this);

        JPanel panelA = new JPanel();
        JPanel panelC = new JPanel();

        Calendar calendario = Calendar.getInstance();
        anoAtual = calendario.get(Calendar.YEAR);

        JLabel txtAnoAtual = new JLabel("Ano atual: " + anoAtual);

        input = new JTextField();
        Dimension preferredSize = new Dimension(50, 25);
        input.setPreferredSize(preferredSize);
        JLabel txtExibicao = new JLabel("Ano nascimento: ");

        JLabel txtResultado = new JLabel("Sua idade será: ");
        output = new JTextField();
        output.setPreferredSize(preferredSize);

        Imagem imagem = new Imagem();
        frame.getContentPane().add(BorderLayout.CENTER, imagem);

        panelA.add(txtAnoAtual);
        panelA.add(txtExibicao);
        panelA.add(input);
        //panelB.add(imagem);
        panelC.add(txtResultado);
        panelC.add(output);

        frame.add(BorderLayout.NORTH, panelA);
        //frame.add(BorderLayout.CENTER, panelB);
        frame.add(BorderLayout.SOUTH, panelC);
        frame.add(BorderLayout.EAST, button);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        int nascimento = Integer.parseInt(input.getText());
        Integer idade = anoAtual - nascimento;
        String idadeTexto = Integer.toString(idade);
        output.setText(idadeTexto);
    }
}
