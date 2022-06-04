import java.util.Scanner;
public class Nomor6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n=scan.nextInt();
        int x=scan.nextInt();
        int y=scan.nextInt();
        int hasil=0;

        for(int i=x;i<=y;i++){
           hasil +=i;
        }
        int jumlah=hasil%n;
        if(jumlah==0){
            System.out.println("habis dibagi " + n);
        }else{
            System.out.println(hasil +"tidak habis dibagi " + n);
        }
        scan.close();
    }
}
