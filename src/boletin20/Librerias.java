package boletin20;

public class Librerias implements Comparable {

    private String titulo;
    private String autor;
    private String ISBN;
    private int prezo;
    private int nunidades;

    public Librerias() {
    }

    public Librerias(String titulo, String autor, String ISBN, int prezo, int nunidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.nunidades = nunidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPrezo() {
        return prezo;
    }

    public void setPrezo(int prezo) {
        this.prezo = prezo;
    }

    public int getNunidades() {
        return nunidades;
    }

    public void setNunidades(int nunidades) {
        this.nunidades = nunidades;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", prezo=" + prezo + ", nunidades=" + nunidades;
    }

    @Override
    public int compareTo(Object o) {
        Librerias x = (Librerias) o;
        if (this.titulo.compareToIgnoreCase(x.titulo) == 0) {
            return 0;
        } else if (this.titulo.compareToIgnoreCase(x.titulo) > 0) {
            return 1;
        } else {
            return -1;
        }

    }
}
