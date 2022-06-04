import java.util.Scanner;

public class Uri1008 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        double z=input.nextDouble();

        System.out.println("NUMBER = " + x);

        double salary=(double)(y * z);
        System.out.printf("SALARY = U$ %.2f\n",salary);
        input.close();
    }
}