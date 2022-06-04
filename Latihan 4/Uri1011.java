import java.util.Scanner;

public class Uri1011{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double x =input.nextDouble();
    
        double volume = ((4/3.0)* 3.14159 * (x * x * x));
    
        System.out.printf("VOLUME = %.3f\n",volume);
        input.close();
    }
 
}