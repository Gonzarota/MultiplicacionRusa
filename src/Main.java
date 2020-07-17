import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Ingresa multiplicador");
        int a=input.nextInt();
        System.out.println("Ingresa multiplicando");
        int b=input.nextInt();

        MRusa multiplicacion=new MRusa();
        System.out.println(multiplicacion.multiplicacionRusa(a,b));

    }
}
