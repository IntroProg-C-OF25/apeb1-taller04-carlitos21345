
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        double cpu, teclado, pantalla, raton, costototal;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("DAME EL COSTO DEL CPU: ");
        cpu = ingreso.nextDouble();
        System.out.print("DAME EL COSTO DEL TECLADO: ");
        teclado = ingreso.nextDouble();
        System.out.print("DAME EL COSTO DE LA PANTALLA: ");
        pantalla = ingreso.nextDouble();
        System.out.print("DAME EL COSTO DEL RATON: ");
        raton = ingreso.nextDouble();
        costototal = cpu + teclado + pantalla + raton;
        System.out.println("COSTO TOTAL DE COMPUTADORA DE ESCRITORIO = " + costototal);
        
    }
}

