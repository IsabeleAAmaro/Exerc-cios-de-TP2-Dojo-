package DOJO2;

public class Album {
    /*

    Implemente a classe “Album”, que representa um CD, possuindo um título, artista,
quantidade de músicas e lista de músicas*. Para que um novo álbum seja criado,
ele precisa receber todas essas informações necessárias. Além dessas
características, implemente também métodos para:

- Checar se uma música está no álbum;
- Verificar o nome da n-ésima música do álbum;
- Imprimir os dados do álbum (título, artista e lista de músicas);
- Alterar a posição de uma música na lista;
     */

    private String titulo;
    private String artista;
    private int qtdMusicas;
    private String[] listaDeMusicas;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getQtdMusicas() {
        return qtdMusicas;
    }

    public void setQtdMusicas(int qtdMusicas) {
        this.qtdMusicas = qtdMusicas;
    }

    public String[] getListaDeMusicas() {
        return listaDeMusicas;
    }

    public void setListaDeMusicas(String[] listaDeMusicas) {
        this.listaDeMusicas = listaDeMusicas;
    }
}
