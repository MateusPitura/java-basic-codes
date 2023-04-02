import java.util.Date;
import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Date relogio = new Date();
        System.out.println("A hora do sistema é " + relogio.toString());
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do sistema é: " + idioma.getDisplayLanguage());
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tamanho = tk.getScreenSize();
        System.out.println("A resolução do sistema é: " + tamanho.width + "x" + tamanho.height);
    }
}
