package practica06ud05;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String opcion;
        Scanner sc = new Scanner(System.in);
        Biblioteca internacional = new Biblioteca(2);
        do {
            System.out.println("--- Menú de Gestión de Biblioteca ---");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Agregar Revista");
            System.out.println("3. Eliminar Ejemplar");
            System.out.println("4. Mostrar Ejemplares");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextLine();
            switch (opcion) {
                case "1" -> {
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = sc.nextLine();
                    System.out.print("Ingrese el año de publicación: ");
                    String anhoPublicacion = sc.nextLine();
                    System.out.print("Ingrese el número de páginas: ");
                    int numeroPaginas = Integer.parseInt(sc.nextLine());
                    System.out.print("Ingrese el género del libro: ");
                    String genero = sc.nextLine();
                    internacional.agregarEjemplar(new Libro(titulo, autor, anhoPublicacion, numeroPaginas, genero));
                }
                case "2" -> {
                    System.out.print("Ingrese el título de la revista: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese el autor de la revista: ");
                    String autor = sc.nextLine();
                    System.out.print("Ingrese el número de edición: ");
                    String numEdicion = sc.nextLine();
                    System.out.print("Ingrese la frecuencia: ");
                    String frecuencia = sc.nextLine();
                    System.out.print("Ingrese el año de la revista: ");
                    String anho = sc.nextLine();
                    internacional.agregarEjemplar(new Revista(titulo, autor, anho, numEdicion, frecuencia));
                }
                case "3" -> {
                    System.out.print("Título del ejemplar a eliminar: ");
                    String titulo = sc.nextLine();
                    internacional.eliminarEjemplar(titulo);
                }
                case "4" -> internacional.mostrarEjemplares();
            }
        } while (!opcion.equals("5"));
        System.out.println("Gracias por usar el sistema de gestión de la biblioteca.");
        sc.close();
    }
}
