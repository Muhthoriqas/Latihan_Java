import java.util.Scanner;

public class Uri1073 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N =input.nextInt();
        
        
        for (int i = 2; i <= N; i+= 2) {
         System.out.print(i+"^2 = "+(i*i)+"\n");
        }
    input.close();
    }
}
