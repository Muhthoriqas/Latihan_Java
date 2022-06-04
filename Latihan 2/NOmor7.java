import java.util.Scanner;

public class NOmor7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int baris=input.nextInt();
        int kolom=input.nextInt();
        int [][] kotak=new int[baris][kolom];

        try{
            for(int i=0;i<baris;i++){
                for(int j=0;j<kolom;j++){
                    if(i == 0 || i==baris-1){
                        kotak[i][j]=0;
                    }else if(i==1|| i==baris-2){
                        if(j==1){
                            kotak[i][j]=2;
                        }else if(j!=0 && j!=kolom-1 ){
                            kotak[i][j]=2;
                        }
                    }else{
                        if(j==0 || j==kolom-1){
                        kotak[i][j]=0;
                        }else if(j==1 || j==kolom-2){
                            kotak[i][j]=2;
                        }else{
                            kotak[i][j]=4;
                        }
                    }
                }
            }
            for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){
                System.out.print(kotak[i][j] + " ");
            }
            System.out.println();
        }
        }catch(Exception e){

        }
        input.close();
    }
}
