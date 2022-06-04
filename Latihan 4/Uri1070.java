import java.util.Scanner;

public class Uri1070 {
    public static void main(String[] args) {
        int i;
        int howManyOdd=6;
        Scanner input=new Scanner(System.in);
        int angka=input.nextInt();
        input.close();
        for(  i = angka; i < (angka+(howManyOdd*2)) ; i+=2){
            int odd;
            if(i%2 ==0){
                odd=i+1;
                System.out.printf("%d\n", odd);
            }else{
                odd=i;
                System.out.printf("%d\n", odd);
            }
            }
        }
    }