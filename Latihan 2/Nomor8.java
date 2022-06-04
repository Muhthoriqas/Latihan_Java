import java.util.Scanner;

public class Nomor8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i]=input.nextInt();
        }
        System.out.println("\n" + "Kelipantan ada " + Hitung(n, k, ar));
        System.out.println("\n" + "Luas " +Luas(n, k));
        input.close();
    }
    public static int Hitung(int n,int k,int[] ar){
        int hasil=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(i<j){
                    int jawab=ar[i] + ar[j];
                    if(jawab %k==0){
                        hasil++;
                    }
                }
            }
        }
        return hasil;
    }
    public static int Luas(int n,int k){
        return n * k;
    }
}
