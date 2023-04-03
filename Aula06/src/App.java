import javax.swing.*;
import java.util.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aula 06");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JButton button = new JButton("Calcular");

        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();
        JPanel panelC = new JPanel();

        Calendar calendario = Calendar.getInstance();
        int anoAtual = calendario.get(Calendar.YEAR);

        JLabel txtAnoAtual = new JLabel("Ano atual: " + anoAtual);

        JTextField input = new JTextField();
        Dimension preferredSize = new Dimension(50, 25);
        input.setPreferredSize(preferredSize);
        JLabel txtExibicao = new JLabel("Ano nascimento: ");

        JLabel txtResultado = new JLabel("Sua idade será: ");

        Imagem imagem = new Imagem();
        frame.getContentPane().add(BorderLayout.CENTER, imagem);

        panelA.add(txtAnoAtual);
        panelA.add(txtExibicao);
        panelA.add(input);
        //panelB.add(imagem);
        panelC.add(txtResultado);

        frame.add(BorderLayout.NORTH, panelA);
        //frame.add(BorderLayout.CENTER, panelB);
        frame.add(BorderLayout.SOUTH, panelC);
        frame.add(BorderLayout.EAST, button);

        frame.setVisible(true);
    }
}
