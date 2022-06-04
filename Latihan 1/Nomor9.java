import java.util.Scanner;

public class Nomor9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("0 ");
        int fibo1=0;
        int fibo2=1;
        int fibo=fibo1 + fibo2;

        while(fibo<100){
            fibo1=fibo2;
            fibo2=fibo;
            fibo=fibo1+fibo2;

            System.out.print(" | " + fibo2);
        }
        input.close();
        }
    }
