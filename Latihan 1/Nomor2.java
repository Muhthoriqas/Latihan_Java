import java.util.*;
public class Nomor2 {
    public static void main(String[] args) {
        int hasil;
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan Hasil Penjualan");
        int jual=input.nextInt();

        if(jual==20000){
            hasil=10000+(jual*10/100);
            System.out.println("Uang Total" +hasil);
        }else if(jual>20000 && jual<=50000){
            hasil=20000+(jual* 15/100);
            System.out.println("Uang Total" +hasil);
        }else if(jual>50000){
            hasil=30000+(jual * 20/100);
            System.out.println("Uang Total" +hasil);
        }else{
            System.out.println("Tidak diberikan tambahan karena penjualan kurang dari Rp. 20.000");
        }
        input.close();
    }
}
