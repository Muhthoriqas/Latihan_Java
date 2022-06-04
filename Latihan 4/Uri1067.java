import java.util.Scanner;

public class Uri1067 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int angka=input.nextInt();
        int count=0;

        System.out.println(1);
        for(int i=1;i<angka-1;i+=2){
                count=i+2;
                System.out.println(count);
            }
            input.close();
        }
    }