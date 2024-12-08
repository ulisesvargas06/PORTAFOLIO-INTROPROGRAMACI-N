import java.util.Scanner;
public class semana {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String dia = null;
        System.out.println("Introduce un día de la semana: ");
        dia = s.nextLine();

        System.out.println("El dia seleccionado de la semana es: " + dia);
    }
}