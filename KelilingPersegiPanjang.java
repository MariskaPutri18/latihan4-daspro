import java.util.Scanner;

public class KelilingPersegiPanjang {
    public static void main (String [] args){

    Scanner input = new Scanner(System.in);

    int panjang;
    int lebar;
    float keliling;

    System.out.print("Masukkan panjang: ");
    panjang = input.nextInt();

    System.out.print("Masukkan lebar: ");
    lebar = input.nextInt();

    keliling = 2 * (panjang + lebar);

    System.out.println("keliling persegi panjang = " + keliling + "cm");
    input.close();
    }
}
