package practica06ud05;

public class Biblioteca {
    private Ejemplar[] ejemplares;

    public Biblioteca(int capacidad) {
        ejemplares = new Ejemplar[capacidad];
    }

    public Ejemplar[] getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Ejemplar[] ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void agregarEjemplar(Ejemplar ejemplar){
        int posicion = buscaPosicionLibre();
        if  (posicion>=0)
            ejemplares[posicion]=ejemplar;
        else
            System.out.println("No se puede agregar el ejemplar");
    }

    private int buscaPosicionLibre(){
        int posicion = -1;
        boolean encontrado = false;
        int actual=0;
        while (!encontrado && actual < ejemplares.length) {
            if (ejemplares[actual] == null) {
                encontrado = true;
                posicion=actual;
            }
            actual++;
        }
        return posicion;
    }

    public void eliminarEjemplar(String titulo){
        boolean encontrado = false;
        int actual=0;
        while (!encontrado && actual < ejemplares.length) {
            if (ejemplares[actual].getTitulo().equalsIgnoreCase(titulo)) {
                encontrado = true;
                ejemplares[actual]=null;
                System.out.println("El ejemplar con el titulo "+titulo+" se ha eliminado");
            }
            actual++;
        }
        if (!encontrado)
            System.out.println("No se puede eliminar el ejemplar porque no existe");
    }

    public void mostrarEjemplares(){
        for (Ejemplar ejemplar : ejemplares) {
            if (ejemplar!=null)
                ejemplar.mostrarInfo();
        }
    }
}

