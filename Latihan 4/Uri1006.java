import java.util.Scanner;
public class Uri1006 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();;

        double med=((a/10 *2)+ (b/10 * 3)+ (c/10 *5));

        System.out.printf("MEDIA = %.1f",med);
        input.close();
    }
}
