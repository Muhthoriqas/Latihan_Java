import java.util.Scanner;

public class Nomor12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int panjang=input.nextInt();
        int lebar = input.nextInt();
        int tinggi = input.nextInt();

        int hasil=Luas(panjang,lebar);
        System.out.println(hasil);
        System.out.println(Volume(panjang, lebar, tinggi));
    }

    public static int Luas(int panjang, int lebar){
        int volume=0;
        volume=panjang * lebar;
        return volume;
    }
    public static int Volume(int panjang,int lebar,int tinggi){
        int luas=0;
        luas =panjang * lebar * tinggi;
        return luas;
    }
}
