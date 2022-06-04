import java.util.Scanner;

public class Uiri1066 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int p=0;
        int n=0;
        int genap=0;
        int ganjil=0;

        for(int i=0;i<5;i++){
            int angka=input.nextInt();
            if(angka>0){
                p++;
                if(angka%2==0){
                    genap++;
                }if(angka%2 !=0){
                    ganjil++;
                }
            }else if(angka<0){
                n++;
                if(angka%2==0){
                    genap++;
                }if(angka%2 !=0){
                    ganjil++;
                }
            }else if(angka==0){
                genap++;
            }
        }
        System.out.println(genap + " valor(es) par(es)");
        System.out.println(ganjil + " valor(es) impar(es)");
        System.out.println(p + " valor(es) positivo(s)");
        System.out.println(n + " valor(es) negativo(s)");
        input.close();
    }
}
