import java.util.Scanner;

public class Nomor5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama=scan.next();
        String pilih=scan.next();
        String nama2=scan.next();
        String pilih2=scan.next();

        if(pilih.equalsIgnoreCase("Kertas")){
            if(pilih2.equalsIgnoreCase("Batu")){
                System.out.println(nama);
            }else if(pilih.equalsIgnoreCase("Gunting")){
                System.out.println(nama2);
            }else{
                System.out.println("Seri");
            }
        }else if(pilih.equalsIgnoreCase("Batu")){
            if(pilih2.equalsIgnoreCase("Kertas")){
                System.out.println(nama2);
            }else if(pilih.equalsIgnoreCase("Gunting")){
                System.out.println(nama);
            }else{
                System.out.println("Seri");
            }
        }else if(pilih.equalsIgnoreCase("Gunting")){
            if(pilih2.equalsIgnoreCase("Kertas")){
                System.out.println(nama);
            }else if(pilih.equalsIgnoreCase("Batu")){
                System.out.println(nama2);
            }else{
                System.out.println("Seri");
            }
        }
    scan.close();
}
}  