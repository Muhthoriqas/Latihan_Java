import java.util.Scanner;

public class Nomor16 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan jumlah seepatu dalam toko");
        int N=input.nextInt();
        int[] sepatuToko=new int[N];
        for(int i=1;i<=sepatuToko.length;i++){
            System.out.print("masukkan ukuran sepatu dalam toko ke-" + i);
            sepatuToko[i-1]=input.nextInt();
        }
            System.out.println("masukkan ukuran sepatu pacar");
            int X=input.nextInt();
        for(int i=1;i<=sepatuToko.length;i++){
            if(sepatuToko[i-1]==X){
                System.out.println("ukuran sepatu " + X + "terdapat pada urutuan ke-" + i);
                break;
            }else if(sepatuToko[i-1] != X){
                continue;
            }
        }
    }
}
