import java.util.Scanner;
class Uri1020{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float a=input.nextFloat();
        float b=input.nextFloat();
        float c=input.nextFloat();

        float triangle = (float) 1/2 *(a*c);

        float circle = (float) (c * c *  Math.PI);

        float trapesium = (((a + b)/2) * c);

        float square = b * b;

        float reactagle = a * b;


        System.out.printf("TRIANGULO: %.3f\n",triangle);
        System.out.printf("CIRCULO: %.3f\n", circle);
        System.out.printf("TRAPEZIO: %.3f\n", trapesium);
        System.out.printf("QUADRADO: %.3f\n", square);
        System.out.printf("RETANGULO: %.3f\n", reactagle);

        input.close();
    }
}