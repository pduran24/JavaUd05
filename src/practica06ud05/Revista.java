package practica06ud05;

public class Revista extends Ejemplar{
    private String numEdicion;
    private Frecuencia frecuencia;

    public Revista(String titulo, String autor, String anho, String numEdicion, String frecuencia) {
        super(titulo, autor, anho);
        this.numEdicion = numEdicion;
        comprobarFrecuencia(frecuencia);
    }

    public String getNumEdicion() {
        return numEdicion;
    }

    public void setNumEdicion(String numEdicion) {
        this.numEdicion = numEdicion;
    }

    public Frecuencia getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        comprobarFrecuencia(frecuencia);
    }

    @Override
    public String toString() {
        return "Revista{" +
                "Nº Edición='" + numEdicion + '\'' +
                ", frecuencia=" + frecuencia ;
    }

    @Override
    public void mostrarInfo() {
        System.out.print(this);
        super.mostrarInfo();
    }

    private void comprobarFrecuencia(String frecuencia) {
        switch (frecuencia.toLowerCase()) {
            case "semanal" -> this.frecuencia = Frecuencia.SEMANAL;
            case "mensual" -> this.frecuencia = Frecuencia.MENSUAL;
            case "trimestral" -> this.frecuencia = Frecuencia.TRIMESTRAL;
            case "semestral" -> this.frecuencia = Frecuencia.SEMESTRAL;
            default -> this.frecuencia = Frecuencia.ANUAL;
        }
    }
}
