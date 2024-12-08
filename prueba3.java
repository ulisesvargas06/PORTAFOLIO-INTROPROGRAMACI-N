public class prueba3 {
    public static void main(String[] args) {
        int num=20;
        while(num!= 21){
            if(num%5==0){
                num=num+3;
            }
            else{
                num--;
                System.out.println(num);
            }
            System.out.println(num);
        }
    }
}