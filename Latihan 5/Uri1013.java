import java.util.Scanner;

public class Uri1013 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int hasil;
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();

        // if(a>b && a>c){
        //     hasil=a;
        // }else if(b>a && b>c){
        //     hasil=b;
        // }else {
        //     hasil=c;
        // }

        hasil = a;
		if(a < b || a < c){
			if(b < c){
				hasil = c;
			}else{
				hasil = b;
			}
		}

        System.out.println(hasil + " eh o maior");
        input.close();
    }
}
