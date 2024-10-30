
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double costoMinuto, cantidadMinutos, valorPlanilla; // DECLARACION
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME COSTO POR MINUTO: ");
        costoMinuto = teclado.nextDouble();
        System.out.print("DAME LA CANTIDAD DE MINUTOS: ");
        cantidadMinutos = teclado.nextDouble();
        //PROCESAMIENTO DE DATOS
        valorPlanilla = costoMinuto * cantidadMinutos;
        System.out.println("VALOR DE LA PLANILLA ES = " + valorPlanilla);
        
        
    }
}
