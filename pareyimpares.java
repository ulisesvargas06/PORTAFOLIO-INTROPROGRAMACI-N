import java.util.Scanner;

public class pareyimpares {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N, Num, Pares, Impares, ContadorImpares;
        Pares = 0;
        Impares = 0;
        ContadorImpares = 0;
        System.out.print("Ingrese la cantidad de Numeros que ingresara (Pares e Impares): ");
        N = s.nextInt();
        for (int i = 0; i<N; i++){
            System.out.print("Ingrese un numero: ");
            Num = s.nextInt();
            if (Num % 2 == 0){
                Pares = Num + Pares;
            } else {
                Impares = Num + Impares;
                ContadorImpares = ContadorImpares + 1;
            }
        }
        if (Pares == 0){
            System.out.println("No se ingreso numeros Pares");
        } else {
            System.out.println("La suma de los numeros Pares es: " + Pares);
        }
        if (Impares == 0){
            System.out.println("No se ingreso numeros Impares");
        } else {
            Impares = Impares / (ContadorImpares);
            System.out.println("El promedio de los impares es: " + Impares);
        }
    }
}