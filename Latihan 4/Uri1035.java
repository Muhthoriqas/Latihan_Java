import java.util.Scanner;

public class Uri1035 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();

        if(b>c && d>a ){
            if((c + d) > (a + b)){
                if(c > 0 && a > 0 ){
                    if(a%2==0){
                        System.out.println("Valores aceitos");
                    }
                }
            }
        }else{
            System.out.println("Valores nao aceitos");
        }
        input.close();
    }
}