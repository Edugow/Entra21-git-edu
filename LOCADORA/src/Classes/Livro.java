package Classes;

public class Livro extends Item{
    private String autor;
    private int qtdepaginas;
    private int anoPublicacao;
    private int edicao;


    //GETTERS E SETTERS

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQtdepaginas() {
        return qtdepaginas;
    }

    public void setQtdepaginas(int qtdepaginas) {
        this.qtdepaginas = qtdepaginas;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
}
