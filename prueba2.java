public class prueba2 {
    public static void main(String[] args) {
        int num=20;
        for(int i=1;i<=5;i++){
            if(num%2==0)
                num++;

            else
                num--;
            System.out.println(num);
        }
        System.out.println(num);
    }
}