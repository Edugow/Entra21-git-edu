import java.util.Scanner;

public class Forca {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String pal = in.nextLine();
        System.out.println("A palavra tem " + pal.length() + " letras");
        char[] lista = new char[pal.length()];
        int j = 0;
        int contF = 0; //contador final
        int tent = 0;
        for (int i = 0; i < pal.length(); i++) {
            lista[i] = ('_');
        }
        boolean partida = (true);
        int conttentativas = 6;
        while (partida) {
            int cont = 0;
            contF = 0;
            System.out.println("");
            System.out.println("Digite uma letra: ");
            String letrains = in.nextLine();  //letra inserida
            for (j = 0; j < lista.length; j++) {
                char letra = letrains.charAt(0);
                if (lista[j] == letra) {
                    System.out.println("Você já digitou esta letra");
                    break;
                }
                if (pal.charAt(j) == letra) {
                    lista[j] = letra;

                    cont += 1;
                }
            }
            if (cont == 0) {
                System.out.println("Você errou");
                conttentativas--;
            }
            if (conttentativas == 0) {
                System.out.println("Você Morreu");
                partida = false;
            }
            for (int i = 0; i < pal.length(); i++) {
                if (lista[i] == '_') {
                    contF++;
                }
            }
            System.out.println(lista);
            if (contF == 0) {
                System.out.println("Parabéns, você ganhou");
                partida = false;
            }
        }
    }
}


