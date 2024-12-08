import java.util.Scanner;
public class Claificaciones {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N;
        int Crango1 = 0, Crango2 = 0, Crango3 = 0 , Crango4 = 0, Crango5 = 0;
        double Calificacion;
        System.out.print("Ingrese la cantidad de calificaciones: ");
        N = s.nextInt();
        for (int i = 0; i<N; i++){
            System.out.print("Ingrese una calificacion: ");
            Calificacion = s.nextDouble();
            if (Calificacion >= 0 && Calificacion <= 3.99){
                Crango1++;
            } else if (Calificacion >= 4 && Calificacion <= 5.99) {
                Crango2++;
            } else if (Calificacion >= 6 && Calificacion <= 7.99) {
                Crango3++;
            } else if (Calificacion >= 8 && Calificacion <= 8.99) {
                Crango4++;
            } else if (Calificacion >= 9 && Calificacion <= 10){
                Crango5++;
            }
        }
        System.out.println("Numero de calificaciones registradas en cada rango: ");
        System.out.println("0...3.99: " + Crango1);
        System.out.println("4...5.99: " + Crango2);
        System.out.println("6...7.99: " + Crango3);
        System.out.println("8...8.99: " + Crango4);
        System.out.println("9...10: " + Crango5);
    }
}