import java.util.Scanner;
public class mes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;
        System.out.println("Ingrese el numero del mes (1-12): ");
        mes= sc.nextInt();
        if (mes==1){
            System.out.println("El mes es Enero");
        }
        else if (mes==2){
            System.out.println("El mes es Febrero");
        }
        else if (mes==3){
            System.out.println("El mes es Marzo");
        }
        else if (mes==4){
            System.out.println("El mes es Abril");
        }
        else if (mes==5){
            System.out.println("El mes es Mayo");
        }
        else if (mes==6){
            System.out.println("El mes es Junio");
        }
        else if (mes==7){
            System.out.println("El mes es Julio");
        }
        else if (mes==8){
            System.out.println("El mes es Agosto");
        }
        else if (mes==9){
            System.out.println("El mes es Septiembre");
        }
        else if (mes==10){
            System.out.println("El mes es Octubre");
        }
        else if (mes==11){
            System.out.println("El mes es Noviembre");
        }
        else if (mes==12){
            System.out.println("El mes es Diciembre");
        }
        else {
            System.out.println("Tiene que ingresar un numero del 1 al 12");
        }
    }
}