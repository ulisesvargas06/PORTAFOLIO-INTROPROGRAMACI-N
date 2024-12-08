import java.util.Scanner;
public class divisibles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingresa el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        num2 = sc.nextInt();
        if (num1 % num2 == 0) {
            System.out.println("Los numeros son divisibles entre si");
        }
        else {
            System.out.println("Los numeros no son divisibles entre si");
        }
    }
}