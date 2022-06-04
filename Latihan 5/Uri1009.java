import java.util.Scanner;

public class Uri1009 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // String name=input.next();
        double a=input.nextDouble();
        double b=input.nextDouble();

        double total =((a) + (b * 15/100));

        String hasil=String.format("TOTAL = R$ %.2f", total);
        System.out.println(hasil);
        input.close();
    }
}