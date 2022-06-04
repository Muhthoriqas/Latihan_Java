import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        int[] burung=new int[n];
        
        for(int i=0;i<burung.length;i++){
            burung[i]=input.nextInt();
        }
        int jawab=HitungBurung(n, burung);
        System.out.println(jawab);
        input.close();
    }
    public static int HitungBurung(int n,int[] burung){
        int max=0;
        int hasil=0;
        for(int j=(burung.length-1);j>0;j--){
            if(max<=burung[j]){
                max=burung[j];
                hasil=j;
            }
        }
        return hasil;
    }
}
