import javax.swing.*;
import java.util.*;
import java.awt.*;

public class App{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aula 05");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();

        Imagem imagem = new Imagem();
        frame.getContentPane().add(BorderLayout.CENTER, imagem);

        Date relogio = new Date();
        Locale idioma = Locale.getDefault();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tamanho = tk.getScreenSize();

        JLabel txtRelogio = new JLabel("Relógio: " + relogio.toString());
        JLabel txtIdioma = new JLabel("Idioma: " + idioma.getDisplayLanguage());
        JLabel txtTamanho = new JLabel("Tamanho: " + tamanho.width + "x" + tamanho.height);

        panelA.add(txtIdioma);
        panelA.add(txtTamanho);
        panelB.add(txtRelogio);

        frame.getContentPane().add(BorderLayout.NORTH, panelA);
        frame.getContentPane().add(BorderLayout.SOUTH, panelB);

        frame.setVisible(true);
    }
}