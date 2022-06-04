import java.util.Scanner;

public class Nomor10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        float y=input.nextFloat();

        float hasil=(float) (x/y);

        String jawaban=String.format("%.3f",hasil);
        System.out.println(jawaban + " km/l");
        input.close();
    }
}
