import java.util.Arrays;
import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int count=0;
        int n=input.nextInt();
        int [] sepatu=new int[n];
        for(int i=0;i<sepatu.length;i++){
            sepatu[i]=input.nextInt();
        }
        Arrays.sort(sepatu);

        for(int i=0;i<n-1;i++){
            if(sepatu[i]== sepatu[i + 1]){
                count++;
                i++;
            }
        }
        System.out.println(count);
        input.close();
    }
}
