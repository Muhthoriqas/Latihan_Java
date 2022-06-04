import java.util.Scanner;
public class Nomor3 {
    public static void main(String[] args) {
        String lagi;
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("Apakah Anda Pelanggan atau Bukan Pelanggan");
            String pelanggan=input.nextLine();

        if(pelanggan.equals("Pelanggan")){
            System.out.println("masukkan Jumlah kertas yang ingin diFotokopi");
            int fotokopi=input.nextInt();
            int harga=fotokopi * 75;
            System.out.println("Harga yang harus dibanyar " + harga);
        }else if(pelanggan.equals("Bukan Pelanggan")){
            int fotokopi=input.nextInt();
            if(fotokopi<100){
                int harga=fotokopi* 150;
                System.out.println("Harga yang harus dibanyar " + harga);
            }else if(fotokopi>=100 && fotokopi<=200){
                int harga=fotokopi * 100;
                System.out.println("Harga yang harus dibanyar " + harga);
            }else{
                int harga=fotokopi*200;
                System.out.println("Harga yang harus dibanyar " + harga);
            }
        }
        System.out.println("\n Ada yang mau fotokopi lagi?(ya/tidak)");
        lagi=input.next();
    } while (lagi.equalsIgnoreCase("ya"));
    input.close();
}
}