import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        float number;
        int p=0;
        float total=0;
        

        for(int i=0;i<6;i++){
            number=input.nextFloat();
            if(number > 0){
                p++;
                total += number;
            }
        }
        float average =total/p;
        System.out.print(p + " valores positivos\n");
        System.out.printf("%.1f\n",average);
        input.close();
    }
}
