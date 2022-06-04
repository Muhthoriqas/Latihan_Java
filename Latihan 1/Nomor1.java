import java.util.*;
public class Nomor1{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan harga jumlah pembelian");
        int beli=input.nextInt();

        if(beli<50000){
            System.out.println("Tidak ada potongan harga");
            System.out.println("Harga yang harus dibayar " + beli);
        }else if(beli>=50000){
            int diskon=beli*20/100;
            int potongan =beli-diskon;
            System.out.println("Harga yang harus dibanyar "+ potongan);
        }
        input.close();
    }
}