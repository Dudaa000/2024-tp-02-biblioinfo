public class Livro {

    String titulo;
    String autor;
    String editora;
    int ano_publicacao;

    public Livro(String titulo,String autor,String editora,int ano_publicacao){

        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano_publicacao = ano_publicacao;
    }

    public static Livro novoLivro(String titulo,String autor,String editora,int ano_publicacao){
        return new Livro(String titulo,String autor,String editora,int ano_publicacao);
    }

}
