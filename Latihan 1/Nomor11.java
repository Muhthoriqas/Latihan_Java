import java.util.*;
public class Nomor11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int answer=9;
        boolean guess = false;
        while(!guess){
            int b=input.nextInt();
            if(b==10){
                continue;
            }
            guess = b == answer;
        }
        System.out.println("end");
        input.close();
    }
    
}
