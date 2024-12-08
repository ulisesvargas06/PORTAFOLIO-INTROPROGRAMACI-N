//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lad1;
        int lad2;
        int lad3;
        int sumlad;
        System.out.println("Ingrese el lado 1: ");
        lad1 = sc.nextInt();
        System.out.println("Ingrese el lado 2: ");
        lad2 = sc.nextInt();
        System.out.println("Ingrese el lado 3: ");
        lad3 = sc.nextInt();
        sumlad = lad1 + lad2;
        if (lad3 > sumlad){
            System.out.println("No es posible hacer un triangulo");
        }
        else if (lad1==lad2 && lad1==lad3 && lad2==lad3){
            System.out.println("El triangulo es equilatero");
        }
        else if (lad1<lad2 && lad2==lad3){
            System.out.println("El triangulo es isosceles");
        }
        else if (lad1==lad2 && lad2<lad3){
            System.out.println("El triangulo es isosceles");
        }
        else if (lad1==lad3 && lad2<lad3){
            System.out.println("El triangulo es isosceles");
        }
        else if (lad1==lad2 && lad2>lad3){
            System.out.println("El triangulo es isosceles");
        }
        else if (lad1 != lad2 && lad2 != lad3 && lad1 != lad3){
            System.out.println("El triangulo es escaleno");
        }
    }
}