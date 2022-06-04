import java.util.Scanner;
public class Nomor13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] angka=new int[n];

        for(int i=0;i<angka.length;i++){
            angka[i]=input.nextInt();
            if(angka[i]%2==0){
                System.out.print(angka[i]+ " ");
            }
        }
        input.close();
    }
}
