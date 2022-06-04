import java.util.Scanner;

public class Uri1060 {
    public static void main(String[] args) {
        int count=0;
        Scanner input=new Scanner(System.in);
        double [] angka=new double[5];

        for(double i=0;i<angka.length;i++){
            angka[(int) i] = input.nextDouble();
            
            }
        for(double i=0;i<angka.length;i++){
            if(angka[(int)i] % 2==0){
                count++;
        }

    }
    System.out.println(count + " valores pares");
    input.close();
    }
}