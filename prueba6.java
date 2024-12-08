public class prueba6 {
    public static void main(String[] args) {
        int num=100;
        while(num>=50){
            if(num%10==0){
                num-=10;
                System.out.println(num);
            }
            else{
                num+=2;
                System.out.println(num);
            }
        }
    }
}