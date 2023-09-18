import java.util.Scanner;

public class KelSegitigaSamaKaki {
    public static void main (String [] args){

    Scanner input = new Scanner(System.in);

    int sisikaki;
    int sisialas;
    float keliling;

    System.out.print("Masukkan sisi kaki: ");
    sisikaki = input.nextInt();

    System.out.print("Masukkan sisi alas: ");
    sisialas= input.nextInt();

   

    keliling = (2 * sisikaki) + sisialas;

    System.out.println("keliling segitiga siku siku = " + keliling + "cm");
    input.close();
    }
}
