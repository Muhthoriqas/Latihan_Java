import java.util.Scanner;

public class Nomor7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] m=new int[n];

        int max,min;

        for(int i=0;i<m.length;i++){
            m[i]=input.nextInt();
        }
        max=m[0];
        min=m[0];
        for(int i=0;i<m.length;i++){
            if(m[i]>max){
                max=m[i];
            }else if(m[i]<min){
                min=m[i];
            }
        }
        System.out.println("nilai max " + max);
        System.out.println("nilai min " + min);
        input.close();
    }
}
