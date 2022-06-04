import java.util.Scanner;

public class Uri1038 {
    public static void main(String[] args) {
        double hasil;
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();

        switch (x) {
            case 1:
                hasil=(double)(y* 4.00 );
                System.out.printf("Total: R$ %.2f\n",hasil);
                break;
            case 2:
                hasil=(double)(4.50 * y);
                System.out.printf("Total: R$ %.2f\n",hasil);
                break;

            case 3:
                hasil=(double)(5.00 * y);
                System.out.printf("Total: R$ %.2f\n",hasil);
                break;
        
            case 4:
            hasil=(double)(2.00 * y);
            System.out.printf("Total: R$ %.2f\n",hasil);
                break;
            
            case 5:
            hasil=(double)(1.50 * y);
            System.out.printf("Total: R$ %.2f\n",hasil);
            break;

        }
        input.close();
    }
}