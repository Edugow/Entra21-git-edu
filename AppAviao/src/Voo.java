
public class Voo {
    public String[][] codificacaoAssento;
    public boolean[][] ocupacaoAssentos;

    public Voo(int linhas, int cadeirasPorLinha) {
        this.ocupacaoAssentos = new boolean[linhas][cadeirasPorLinha];
        this.codificacaoAssento = new String[linhas][cadeirasPorLinha];
        String alfateste = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < cadeirasPorLinha; j++) {
                this.codificacaoAssento[i][j] = String.valueOf(alfateste.charAt(i)) + String.valueOf(j + 1) + " ";
            }
        }
    }

    public boolean verificaOcupacao(String codigo) {
        for (int i = 0; i < this.codificacaoAssento.length; i++) {
            for (int j = 0; j < this.codificacaoAssento[i].length; j++) {
                if (this.codificacaoAssento[i][j].equals(codigo + " ")) {
                    return this.ocupacaoAssentos[i][j];

                }
            }
        }
        return false;
    }

    public void ocupar(String codigo) {
        for (int i = 0; i < codificacaoAssento.length; i++) {
            for (int j = 0; j < codificacaoAssento[i].length; j++) {
                if (this.codificacaoAssento[i][j].equals(codigo + " ")) {
                    this.ocupacaoAssentos[i][j] = true;
                }
            }
        }
    }

    public int quantidadeLivre() {
        int contadorLivres = 0;
        for (int i = 0; i < this.ocupacaoAssentos.length; i++) {
            for (int j = 0; j < this.ocupacaoAssentos[i].length; j++) {
                if (this.ocupacaoAssentos[i][j] == false) {
                    contadorLivres += 1;
                }
            }
        }
        return contadorLivres;
    }

    public void mostrarAssentos() {
        for (int i = 0; i < this.ocupacaoAssentos.length; i++) {
            for (int j = 0; j < this.ocupacaoAssentos[i].length; j++) {
                if (this.ocupacaoAssentos[i][j] == false) {
                    System.out.print(this.codificacaoAssento[i][j]);
                } else {
                    System.out.print("XX ");
                }
            }
            System.out.println("");
        }
    }
}

