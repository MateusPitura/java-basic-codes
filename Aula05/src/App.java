import javax.swing.*;
import java.util.*;
import java.awt.*;

public class App{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aula 05");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        Imagem imagem = new Imagem();
        frame.getContentPane().add(imagem);

        Date relogio = new Date();
        Locale idioma = Locale.getDefault();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tamanho = tk.getScreenSize();

        JTextArea txtRelogio = new JTextArea(relogio.toString());
        JTextArea txtIdioma = new JTextArea(idioma.getDisplayLanguage());
        JTextArea txtTamanho = new JTextArea(tamanho.width + "x" + tamanho.height);

        frame.getContentPane().add(txtRelogio);
        frame.getContentPane().add(txtIdioma);
        frame.getContentPane().add(txtTamanho);

        frame.setVisible(true);
    }
}