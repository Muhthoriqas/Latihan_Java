import java.util.Scanner;

public class Nomor14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String kata=input.nextLine();
        String kataBalik="";

        for(int i=kata.length()-1;i>=0;i--){
           kataBalik +=  kata.charAt(i);
        }
        System.out.println(kataBalik);
        input.close();
    }
}
