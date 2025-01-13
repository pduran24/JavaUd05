package practica01ud05;

import javax.print.DocFlavor;
import java.time.chrono.MinguoDate;
import java.util.Random;

public class Persona {

    private String nombre;
    private int edad;
    private String dni;
    private double peso;
    private double altura;

    private Sexo sexo;

    public Persona () {
        this("",20,70,1.70,'H');
    }

    public Persona (String nombre, int edad, char sexo) {
        setNombre(nombre);
        setEdad(edad);
        setSexo(sexo);
    }

    public Persona (String nombre, int edad, double peso, double altura, char sexo) {
        setNombre(nombre);
        setEdad(edad);
        setDni(generarDNI());
        setPeso(peso);
        setAltura(altura);
        setSexo(sexo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        comprobarSexo(sexo);
    }

    private void comprobarSexo(char sexo) {
        if (sexo == 'm' || sexo=='M') {
            this.sexo = Sexo.M;
        } else {
            this.sexo = Sexo.H;
        }
    }

    public int calcularIMC() {
        double imc = peso/(Math.pow(altura,2));
        int factor = 0;

        if (imc<18.5)
            factor = -1;
        else if (imc>25)
            factor = 1;

        return factor;
    }

    public boolean esMayorDeEdad() {
        boolean mayor = false;

        if (edad>18)
            mayor = true;

        return mayor;
    }

    private String generarDNI() {

        Random r = new Random();
        int numero = 10000000 + r.nextInt(90000000); //Número aleatorio de 8 cifras
        char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        char letra = letras[numero%23];

        return ""+numero+letra;
    }



    @Override
    public String toString() {
        return String.format("Nombre: %s\nEdad: %d\nDNI: %s\nPeso: %f\nAltura: %f\nSexo: %s",nombre,edad,dni,peso,altura,sexo);
    }
}
