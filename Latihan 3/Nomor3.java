import java.util.Scanner;

public class Nomor3 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int x=0;
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                x=sc.nextInt();
                System.out.println(s1);
                if(i==0){
                    System.out.println(x);
                    }
                if(i==1){
                    System.out.println("0"+x);                    
                    }
                    if(i==2){
                    System.out.println("0"+x);                                        
                    }
            }
            sc.close();
            System.out.println("================================");

    }
}

