import java.util.Scanner;
public class Nomor17 {
    public static void main(String[] args) {
         System.out.println(hitungLuas());
    }
    
        public static int hitungLuas(){
            Scanner input=new Scanner(System.in);
            System.out.println("Masukkan jumlah seepatu dalam toko");
            int N=input.nextInt();
            int[] sepatuToko=new int[N];
            int i;
            
            for(i=1;i<=sepatuToko.length;i++){
                System.out.print("masukkan ukuran sepatu dalam toko ke-" + i);
                sepatuToko[i-1]=input.nextInt();
            }
            System.out.println("masukkan ukuran sepatu pacar");
            int X=input.nextInt();
          
        for(i=1;i<=sepatuToko.length;i++){
            if(sepatuToko[i-1]==X){
                System.out.println("ukuran sepatu " + X + "terdapat pada urutuan ke-" + i);

        }
        input.close();
    }
    return hitungLuas();
        }
}
