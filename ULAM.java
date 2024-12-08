import java.util.Scanner;
public class ULAM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N, Numero;
        System.out.println("Ingrese el valor: ");
        Numero = s.nextInt();
        for (;Numero != 1;){
            System.out.println(Numero);
            if (Numero % 2 == 0){
                Numero = Numero / 2;
            } else {
                Numero = (Numero * 3) + 1;
            }
        }
        System.out.println("1");
    }
}