
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        double monto_pres, inte_mensual, pago_total_men;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("INGRESE EL MONTO DEL PRESTAMO: ");
        monto_pres = ingreso.nextDouble();
        System.out.print("INGRESE EL INTERES MENSUAL EN (%): ");
        inte_mensual = ingreso.nextDouble();
        pago_total_men = (monto_pres * inte_mensual)/ (1- Math.pow(1+ inte_mensual, -12));
        System.out.println("PAGO MENSUAL = " + pago_total_men);
    }
    
}