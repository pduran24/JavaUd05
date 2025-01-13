package practica04ud05;

public class Test {
    public static void main(String[] args) {
        Matriz m1 = new Matriz(3);
        Matriz m2 = new Matriz(3);
        int[] vector1 = {3, 2, 1, 1, 2, 3, 2, 3, 1};
        int[] vector2 = {1, 1, 2, 2, 1, 1, 1, 2, 1};
        m1.asignarDatos(vector1);
        m2.asignarDatos(vector2);
        m1.mostrar();
        m2.mostrar();
        //  m1.suma(m2);
        System.out.println("MULTIPLICACIÓN DE MATRICES");
        m1.producto(m2);
    }
}