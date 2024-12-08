//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese un numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese otro numero");
        num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1);
            System.out.println(num2);
        }
        else {
            System.out.println(num2);
            System.out.println(num1);
        }
    }
}