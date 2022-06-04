import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int b=input.nextInt();
        int a=input.nextInt();
        float c=input.nextInt();

        float D=(b*b)-(2*a*c);

        System.out.println("nilai determinan " + D);
        input.close();
    }
}
