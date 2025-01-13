package practica06ud05;

public class Ejemplar {
    private String titulo;
    private String autor;
    private String anho;

    public Ejemplar(String titulo, String autor, String anho) {
        this.titulo = titulo;
        this.autor = autor;
        this.anho = anho;
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

    public String getAnho() {
        return anho;
    }

    public void setAnho(String anho) {
        this.anho = anho;
    }

    @Override
    public String toString() {
        return ", título='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", año='" + anho + '\'' +
                "}";
    }

    public void mostrarInfo(){
        System.out.println(", título='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", año='" + anho + '\'' +
                "}");
    }
}
