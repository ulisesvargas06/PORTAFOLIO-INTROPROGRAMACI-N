import java.util.Scanner;
public class Serie {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N;
        double Suma;
        System.out.print("Ingrese el numero entero: ");
        N = s.nextInt();
        Suma = 0.0;
        for (int i = 1; i <= N; i++) {
            Suma += 1.0 / i;
        }
        System.out.println("El resultado de la serie es: " + Suma);
    }
}