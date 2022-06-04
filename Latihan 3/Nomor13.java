import java.util.Scanner;

public class Nomor13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int waktu=input.nextInt();

        int jam=waktu%3600;
        int menit=waktu%60;
        int detik=waktu-menit;

        System.out.println(jam + " " + menit + " " + detik);
}
}
