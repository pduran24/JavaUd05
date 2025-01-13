package practica04ud05;

public class Matriz {
    private int [][] arrayMatriz;

    public Matriz(int dimension) {
        if (dimension>1)
            arrayMatriz = new int[dimension][dimension];
    }

    public int[][] getArrayMatriz() {
        return arrayMatriz;
    }

    public void setArrayMatriz(int[][] arrayMatriz) {
        this.arrayMatriz = arrayMatriz;
    }

    public void asignarDatos(int[] vector){
        if (vector.length == arrayMatriz.length*arrayMatriz[0].length){
            int i = 0;
            for (int fila = 0; fila < arrayMatriz.length; fila++) {
                for (int columna = 0; columna < arrayMatriz[0].length ; columna++) {
                    arrayMatriz[fila][columna] = vector[i];
                    i++;
                }
            }
        }
    }

    public void suma(Matriz m){
        for (int fila = 0; fila < arrayMatriz.length; fila++) {
            System.out.print("( ");
            for (int columna = 0; columna < arrayMatriz[0].length ; columna++) {
                System.out.print(this.arrayMatriz[fila][columna] +
                        m.getArrayMatriz()[fila][columna]+" ");
            }
            System.out.println(")");
        }
    }

    public void mostrar(){
        System.out.println();
        for (int fila = 0; fila < arrayMatriz.length; fila++) {
            System.out.print("( ");
            for (int columna = 0; columna < arrayMatriz[0].length ; columna++) {
                System.out.print(this.arrayMatriz[fila][columna] + " ");
            }
            System.out.println(")");
        }
        System.out.println();
    }

    private int[] getFila(int fila){
        int[] resultado = new int[arrayMatriz.length];
        for (int columna = 0; columna < arrayMatriz[0].length ; columna++) {
            resultado[columna] = arrayMatriz[fila][columna];
        }
        return resultado;
    }

    private int[] getColumna(int columna){
        int[] resultado = new int[arrayMatriz.length];
        for (int fila = 0; fila < arrayMatriz[0].length ; fila++) {
            resultado[fila] = arrayMatriz[fila][columna];
        }
        return resultado;
    }

    private int multiplica(int[] fila, int[] columna){
        int resultado = 0;
        for (int i = 0; i < fila.length; i++) {
            resultado += fila[i] * columna[i];
        }
        return resultado;
    }

    public void producto(Matriz m){
        for (int fila = 0; fila < arrayMatriz.length; fila++) {
            System.out.print("( ");
            for (int columna = 0; columna < arrayMatriz[0].length ; columna++) {
                System.out.print(multiplica(this.getFila(fila), m.getColumna(columna))+" ");
            }
            System.out.println(")");
        }
    }

}
