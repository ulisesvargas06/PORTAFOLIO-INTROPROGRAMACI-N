public class prueba7 {
    public static void main(String[] args) {
        int num=6;
        for(int i=2;i<=10;i++){
            if((num+2)%3==0){
                System.out.println(num);
                num--;
            }
            else{
                num++;
            }
        }
    }
}