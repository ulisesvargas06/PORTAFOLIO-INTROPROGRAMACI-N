import java.util.Scanner;
public class nivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nivel, din;
        System.out.println("Ingrese su nivel:");
        nivel = sc.nextDouble();
        din = 2400*nivel;

        if (nivel==0.0){
            System.out.println("Su dinero es igual a: " + din);
        }
        else if (nivel==0.4) {
            System.out.println("Su dinero es igual a: " + din);
        }
        else if (nivel>=0.6) {
            System.out.println("Su dinero es igual a: " + din);
        }
        else {
            System.out.println("Ingrese un valor válido");
        }
    }
}