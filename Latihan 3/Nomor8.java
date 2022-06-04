import java.util.Scanner;

public class Nomor8 {
 
    public static void main(String[] args) {
 
    Scanner input=new Scanner(System.in);
    float x=input.nextFloat();
    float y=input.nextFloat();
    float z=input.nextFloat();
    
    double hasilx=(float) x+0.2;
    double hasily=(float) y+0.3;
    double hasilz=(float) z+0.05;

    double hasil=(float) (hasilx +hasily + hasilz)/3.0;

    String media=String.format("MEDIA = %.1f", hasil);
    System.out.println(media);

    input.close();
    }
}