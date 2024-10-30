
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        double ladocua, altutri, areacua, areatri, arearec, areatotal;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("DAME EL LADO DEL CUADRADO: ");
        ladocua = ingreso.nextDouble();
        System.out.print("DAME LA ALTURA DEL TRIANGULO: ");
        altutri = ingreso.nextDouble();
        System.out.print("DAME EL AREA DEL CUADRADO:  ");
        areacua = ingreso.nextDouble();
        System.out.print("DAME EL AREA DEL TRIANGULO: ");
        areatri = ingreso.nextDouble();
        System.out.print("DAME EL AREA DEL RECTANGULO: ");
        arearec = ingreso.nextDouble();
        areatotal = areacua + (areatri * 3)+ arearec;
        System.out.println("AREA TOTAL = " + areatotal);
      
    }
}
