import java.util.*;
public class Nomor4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int angka=input.nextInt();
        String sembarang="";
        switch (angka) {
            case 1:
            System.out.println("angka olahraga");
                break;
            case 2:
            System.out.println("alat eletrolik");
            break;
            case 3:
            System.out.println("Alat masak");
            default:
            sembarang ="Salah masukkan kode";
            break;
        }
        System.out.println(sembarang);
        input.close();
    }
}
