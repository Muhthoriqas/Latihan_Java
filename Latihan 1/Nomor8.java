import java.util.Scanner;

public class Nomor8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int berhasil=0;
        int tidakBerhasil=0;
        int[] tembak =new int[9];
        int[] sasaran=new int[9];

        for(int i=0;i<tembak.length;i++){
            tembak[i]=input.nextInt();
        }
        for(int i=0;i<sasaran.length;i++){
            sasaran[i]=input.nextInt();
    }   
    for(int i=0;i<tembak.length;i++){
        int[] h=new int[9];
        h[i]=(tembak[i]*tembak[i])+1;
        if(h[i]==sasaran[i]){
            berhasil++;
        }else{
            tidakBerhasil++;
        }
    }
    System.out.println("yang berhasil" + berhasil);
    System.out.println("yang tidak berhasil " + tidakBerhasil);
    input.close();
}
}
