import java.util.Scanner;

public class Nomor6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] kue=new int[n];

        for(int i=0;i<kue.length;i++){
            kue[i]=input.nextInt();
        }
        int d=input.nextInt();
        int m=input.nextInt();

        int index=0;
        int result=0;
        int hasil=0;

        for(int i=0;i<n;i++){
            index=i;
        }
        try{
            for(int j=0;j<m;j++){
                hasil += kue[index + j];
            }
        }catch(Exception e){
        }
        if(hasil==d){
            result++;
        }
        hasil=0;
        System.out.println(result);
        input.close();
    }
}
