import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int bintang=input.nextInt();

        int i=1;
        while(i<=bintang){
            int j=bintang-1;
            while(j>=i){
                System.out.print("  ");
                j--;
            }
            int k=1;
            while(k<=i){
                System.out.print("* ");
                k++;
            }
            int l=1;
            while(l<=i-1){
                System.out.print("* ");
                l++;
            }
            i++;
            System.out.println();
        }
        System.out.println("");
        input.close();
    }
}
