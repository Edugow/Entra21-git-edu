import java.sql.SQLOutput;
import java.util.Scanner;

public class CodigoMorse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lingua = 0;
        while (true) {
            System.out.println("Digite 1 para traduzir Português para Morse, e 2 para traduzir Morse para Português:");
            lingua = in.nextInt();
            in.nextLine();
            if (lingua == 1) {
                System.out.println("Digite a frase em Português");
                String port = in.nextLine();
                port = port.toLowerCase();
                String morse = port.replace("a", ".-|");
                morse = morse.replace("b", "-...|");
                morse = morse.replace("c", "-.-.|");
                morse = morse.replace("d", "-..|");
                morse = morse.replace("e", ".|");
                morse = morse.replace("f", "..-.|");
                morse = morse.replace("g", "--.|");
                morse = morse.replace("h", "....|");
                morse = morse.replace("i", "..|");
                morse = morse.replace("j", ".---|");
                morse = morse.replace("k", "-.-|");
                morse = morse.replace("l", ".-..|");
                morse = morse.replace("m", "--|");
                morse = morse.replace("n", "-.|");
                morse = morse.replace("o", "---|");
                morse = morse.replace("p", ".--.|");
                morse = morse.replace("q", "--.-|");
                morse = morse.replace("r", ".-.|");
                morse = morse.replace("s", "...|");
                morse = morse.replace("t", "-|");
                morse = morse.replace("u", "..-|");
                morse = morse.replace("v", "...-|");
                morse = morse.replace("w", ".--|");
                morse = morse.replace("x", "-..-|");
                morse = morse.replace("y", "-.--|");
                morse = morse.replace("z", "--..|");
                morse = morse.replace("1", ".----|");
                morse = morse.replace("2", "..---|");
                morse = morse.replace("3", "...--|");
                morse = morse.replace("4", "....-|");
                morse = morse.replace("5", ".....|");
                morse = morse.replace("6", "-....|");
                morse = morse.replace("7", "--...|");
                morse = morse.replace("8", "---..|");
                morse = morse.replace("9", "----.|");
                morse = morse.replace("0", "-----|");
                morse = morse.replace(".", ".-.-.-|");
                morse = morse.replace("(", "-.--.|");
                morse = morse.replace("+", ".-.-.|");
                morse = morse.replace(",", "--..--|");
                morse = morse.replace(")", "-.--.-|");
                morse = morse.replace("-", "-....-|");
                morse = morse.replace("?", "..--..|");
                morse = morse.replace("&", ".-...|");
                morse = morse.replace("_", "..--.-|");
                morse = morse.replace("!", "-.-.--|");
                morse = morse.replace(";", "-.-.-.|");
                morse = morse.replace("$", "...-..-|");
                morse = morse.replace("/", "-..-.|");
                morse = morse.replace("=", "-...-|");
                morse = morse.replace("@", ".--.-.|");
                morse = morse.replace(" ", "*|");
                System.out.println(morse);
                break;

            } else if (lingua == 2) {
                System.out.println("Digite o código Morse");
                String morse = in.nextLine();
                morse = morse.replace(".-.-.-|", ".");
                morse = morse.replace("-.--.|", "(");
                morse = morse.replace(".-.-.|", "+");
                morse = morse.replace("--..--|", "+");
                morse = morse.replace("-.--.-|", ")");
                morse = morse.replace("-....-|", "-");
                morse = morse.replace("..--..|", "?");
                morse = morse.replace(".-...|", "&");
                morse = morse.replace("..--.-|", "_");
                morse = morse.replace("-.-.--|", "!");
                morse = morse.replace("-.-.-.|", ";");
                morse = morse.replace("...-..-|", "$");
                morse = morse.replace("-..-.|", "/");
                morse = morse.replace("-...-|", "=");
                morse = morse.replace(".--.-.|", "@");
                String port = morse.replace(".----|", "1");
                port = port.replace("..---|", "2");
                port = port.replace("...--|", "3");
                port = port.replace("....-|", "4");
                port = port.replace(".....|", "5");
                port = port.replace("-....|", "6");
                port = port.replace("--...|", "7");
                port = port.replace("---..|", "8");
                port = port.replace("----.|", "9");
                port = port.replace("-----|", "0");
                port = port.replace("-...|", "b");
                port = port.replace("-.-.|", "c");
                port = port.replace(".-..|", "l");
                port = port.replace("--..|", "z");
                port = port.replace("-..|", "d");
                port = port.replace("..-.|", "f");
                port = port.replace(".--.|", "p");
                port = port.replace("--.|", "g");
                port = port.replace("....|", "h");
                port = port.replace(".---|", "j");
                port = port.replace("--.-|", "q");
                port = port.replace("-.-|", "k");
                port = port.replace("-.--|", "y");
                port = port.replace(".--|", "w");
                port = port.replace("---|", "o");
                port = port.replace("--|", "m");
                port = port.replace(".-.|", "r");
                port = port.replace("-.|", "n");
                port = port.replace("-..-|", "x");
                port = port.replace("...-|", "v");
                port = port.replace("..-|", "u");
                port = port.replace("...|", "s");
                port = port.replace(".-|", "a");
                port = port.replace("-|", "t");
                port = port.replace("*|", " ");
                port = port.replace("..|", "i");
                port = port.replace(".|", "e");
                System.out.println(port);
                break;
            } else {
                System.out.println("Digite uma opção válida");
            }

        }


    }
}
