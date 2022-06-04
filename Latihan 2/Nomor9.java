
import java.util.Arrays;
import java.util.Scanner;

public class Nomor9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int count=0;
        int n=input.nextInt();
        int[] kaos=new int[n];
        int m=input.nextInt();
        String s=input.next();

        for(int i=0;i<kaos.length;i++){
            kaos[i]=input.nextInt();
        }
        System.out.println("Kaos yang sama " + HitungKaos(count, n, kaos));
        System.out.println("Hasinya " + Gunung(m, s));
    }
    public static int HitungKaos(int count,int n,int[] kaos){
        Arrays.sort(kaos);

        for(int i=0;i<n-1;i++){
            if(kaos[i] == kaos[i + 1])
                count++;
        }
        return count;
    }
    public static int Gunung(int m,String s){
        int hasil=0;
        int hitung=0;
        for(char jumlah:s.toCharArray()){
            if(jumlah == 'U'){
                ++hitung;
            }
            if(jumlah == 'D'){
                --hitung;
            }
            if(hitung == 0 && hitung == 'U'){
                ++hasil;
        }
        }
        return hasil;
    }
}
