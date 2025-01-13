package practica01ud05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir el nombre: ");
        String nombre = sc.next();

        System.out.println("Introducir la edad: ");
        int edad = sc.nextInt();

        sc.nextLine();

        System.out.println("Introducir el sexo: ");
        char sexo = sc.nextLine().charAt(0);

        System.out.println("Introducir el peso: ");
        double peso = sc.nextDouble();

        System.out.println("Introducir la altura: ");
        double altura = sc.nextDouble();

        Persona p1 = new Persona(nombre,edad,peso,altura,sexo);
        Persona p2 = new Persona(nombre,edad,sexo);
        Persona p3 = new Persona();

        System.out.println("---------------");
        mensaje(p1);
        System.out.println("---------------");
        System.out.println("\n");

        System.out.println("---------------");
        System.out.println(p1);
        System.out.println("---------------");
        System.out.println(p2);
        System.out.println("---------------");
        System.out.println(p3);



    }

    private static void mensaje(Persona p) {

        if (p.calcularIMC()==-1)
            System.out.println("Por debajo de su peso ideal.");
        else if (p.calcularIMC()==1)
            System.out.println("Tiene sobrepeso.");
        else
            System.out.println("Se encuentra en su peso ideal.");
    }


}
