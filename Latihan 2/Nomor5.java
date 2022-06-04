import java.util.Scanner;

public class Nomor5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int n=input.nextInt();
        int[] grade=new int[n];
        int[] res=new int[grade.length];
        System.out.println("masukkan nilai setiap siswa");
        for(int i=0;i<grade.length;i++){
            grade[i]=input.nextInt();
            if(grade[i]%5>2 && !(grade[i] < 38)){
                res[i]=grade[i] + (5-grade[i]%5);
            }else{
                res[i]=grade[i];
            }
            System.out.println(res[i]);
        }
        input.close(); 
    }
}
