
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        double hijo1, hijo2, hijo3, gastostotales;
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME EL GASTO DEL PRIMER HIJO: ");
        hijo1 = teclado.nextDouble();
        System.out.print("DAME EL GASTO DEL SEGUNDO HIJO: ");
        hijo2 = teclado.nextDouble();
        System.out.print("DAME EL GASTO DEL TERCER HIJO: ");
        hijo3 = teclado.nextDouble();
        gastostotales = (hijo1 + hijo2 + hijo3);
        System.out.println("Gastos totales es = " + gastostotales);
        
        
        
    }
}
