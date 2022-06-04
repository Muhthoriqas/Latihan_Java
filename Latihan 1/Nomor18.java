import java.util.Scanner;
public class Nomor18 {
	public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String namaDepan=input.next();
        String namaBelakang=input.next();
        int tahun=input.nextInt();
        String penerbit=input.next();
        String judul=input.next();
        System.out.println(nama(namaDepan, namaBelakang) + ". " + Tahun(tahun)+ ". " + Judul(judul) + "." + Penerbit(penerbit));
    }
    public static String nama(String namaDepan,String namaBelakang){
    String namaD="";
    namaD= namaBelakang + ","+ namaDepan;
    return namaD;
    }
    public static int Tahun(int tahun){
        int hasil=tahun ;
        return hasil;
    }
    public static String Penerbit(String penerbit){
        String penerbit1=penerbit;
        return penerbit1;
    }
    public static String Judul(String judul){
        String judul1=judul;
        return judul1;
    }
}
