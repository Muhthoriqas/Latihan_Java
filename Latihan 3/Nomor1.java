import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int harga=input.nextInt();
        String bonus=null;
        if(harga==1500000){
            bonus="mendapatkan bonus setrika";
        }else if(harga==1000000){
            bonus="mendapatkan bonus meja";
        }else if(harga==500000){
            bonus="mendapatkan ballpounint";
        }else{
            System.out.println("Terima Kasih telah membeli");
        }
        System.out.println(bonus);
        input.close();
    }
}