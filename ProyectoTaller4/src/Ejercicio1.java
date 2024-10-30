
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        double base, altura, area; // declaracion
        Scanner ingreso = new Scanner(System.in); // INGRESAR VALORES POR CONSOLA
        System.out.print("DAME LA BASE: "); // Carpinteria de salida
        base = ingreso.nextDouble(); // Datos de entrada
        System.out.print("DAME LA ALTURA: ");
        altura = ingreso.nextDouble();
        //PROCESAMIENTO DE DATOS DE ENTRADA
        area = (base * altura)/ 2;
        // PRESENTACION DE DATOS DE SALIDA
        System.out.println("Area del triangulo es = " + area);
        
    }
}
