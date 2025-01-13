package practica06ud05;

public class Libro extends Ejemplar{
    private int numPaginas;
    private Genero genero;

    public Libro(String titulo, String autor, String anho, int numPaginas, String genero) {
        super(titulo, autor, anho);
        this.numPaginas = numPaginas;
        comprobarGenero(genero);
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        comprobarGenero(genero);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "numPaginas=" + numPaginas +
                ", genero=" + genero;
    }

    @Override
    public void mostrarInfo(){
        System.out.print(this);
        super.mostrarInfo();
    }

    private void comprobarGenero(String genero){
        switch(genero.toLowerCase()){
            case "ciencia" -> this.genero = Genero.CIENCIA;
            case "ficcion" -> this.genero = Genero.FICCION;
            default -> this.genero = Genero.CIENCIA_FICCION;
        }
    }
}

