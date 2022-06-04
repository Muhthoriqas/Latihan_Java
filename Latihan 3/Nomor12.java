import java.util.Scanner;

public class Nomor12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();

        int jawab=x*y;

        float hasil=(float) (jawab/12.0);
        System.out.printf("%.3f",hasil);

        input.close();
    }
}
