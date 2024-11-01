import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        double cost_netflix, cost_youtubepremium, cost_dropbox, cost_spotify, totalmensual, cost_total;
        int edad;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("DAME EL COSTO DE NETFLIX: ");
        cost_netflix = ingreso.nextDouble();
        System.out.print("DAME EL COSTO DE YOUTUBE PREMIUM: ");
        cost_youtubepremium = ingreso.nextDouble();
        System.out.print("DAME EL COSTO DE DROPBOX: ");
        cost_dropbox = ingreso.nextDouble();
        System.out.print("DAME EL COSTO DE SPOTIFY: ");
        cost_spotify = ingreso.nextDouble();
        System.out.print("DAME LA EDAD DE LA PERSONA: ");
        edad = ingreso.nextInt();
        totalmensual = (cost_netflix + cost_youtubepremium + cost_dropbox + cost_spotify);
        cost_total = totalmensual * (1 - 0.2 * (edad < 30 ? 1 : 0));
        System.out.println("TOTAL DE SERVICIOS DIGITALES  = " + totalmensual );
    }
}
