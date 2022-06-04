import java.util.Scanner;

public class Nomor5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int k=N-2;

        for(int i=1;i<N;i++){
        if((i%7<2) ||(i % 2 > (N-3))){
            k *= (N & 3);
        }else if(i % 2 >= 4){
            k -= (k + N);
        }else{
            k= k ^ 2;
        }
        }
        System.out.println(k);
        input.close();
    }
}
