import java.util.Scanner;

public class Uri1065 {
    public static void main(String[] args) {
        int count=0;
        Scanner input=new Scanner(System.in);
        double [] angka=new double[6];

        for(double i=0;i<angka.length;i++){
            angka[(int) i] = input.nextDouble();
            
            }
        for(double i=0;i<angka.length;i++){
            if(angka[(int)i]>0){
                count++;
        }

    }
    System.out.println(count + " valores positivos");
    input.close();
    }
    
}