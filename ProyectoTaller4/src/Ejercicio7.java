import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        double cost_kilovatio, valor_consu, valortotal;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("INGRESE EL COSTO POR KILOVATIO: ");
        cost_kilovatio = ingreso.nextDouble();
        System.out.print("INGRESE LOS KILOVATIOS CONSUMIDOS: ");
        valor_consu = ingreso.nextDouble();
        System.out.print("INGRESE LA EDAD DE LA PERSONA: ");
        int edad = ingreso.nextInt();
        valortotal = cost_kilovatio * valor_consu * (1 - 0.1 * (edad > 65 ? 1 : 0));
        System.out.print("TOTAL A PAGAR  = " + valortotal);   
    }
}

