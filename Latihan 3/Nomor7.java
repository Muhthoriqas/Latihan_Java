import java.util.Scanner;

public class Nomor7 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        int day=input.nextInt();
        int month=input.nextInt();
        int year=input.nextInt();
        String jawab=getdays(day, month, year);
        System.out.println(jawab);
        input.close();
    }

    public static String getdays(int day,int month,int year){
        String hari="";
        if(year>=2000 && year<=3000){
            if(day==1 || day== 8 || day==15 || day==22 || day==29){
                hari="TUESDAY";
            }else if(day%7==0 && day<=28){
                hari="MONDAY";
            }else if(day==6 || day==13 || day==20 || day==27){
                hari="SUNDAY";
            }else if (day ==2 || day==9 || day==16 || day==23 || day==30){
                hari="WEDNESDAY";
            }else if(day==3 || day ==10 || day==17 || day==24){
                hari="THUSDAY";
                System.out.println("THUSDAY");
            }else if(day==4 || day ==11 || day==18 || day==25){
                hari="FRIDAY";
            }else if(day==5 || day ==12 || day==19 || day==26){
                hari="SATURDAY";
            }
        }
    return hari;
    }
}
