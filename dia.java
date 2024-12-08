import java.util.Scanner;
public class dia {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int dia;
        System.out.println("Ingrese el número del día (1-7): ");
        dia = s.nextInt();
        if (dia==1){
            System.out.println("El dia es Lunes");
        }
        else if (dia==2) {
            System.out.println("El dia es igual a Martes");
        }
        else if (dia==3) {
            System.out.println("El dia es igual a Miercoles");
        }
        else if (dia==4) {
            System.out.println("El dia es igual a Jueves");
        }
        else if (dia==5) {
            System.out.println("El dia es igual a Viernes");
        }
        else if (dia==6) {
            System.out.println("El dia es igual a Sabado");
        }
        else if (dia==7) {
            System.out.println("El dia es igual a Domingo");
        }
        else {
            System.out.println("Tiene que ingresar un numero del 1 al 7");
        }
    }
}

