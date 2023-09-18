import java.util.Scanner;

public class KelilingSegitigaSikuSiku {
    public static void main (String [] args){

    Scanner input = new Scanner(System.in);

    int sisi1;
    int sisi2;
    double keliling;

    System.out.print("Masukkan sisi1: ");
    sisi1 = input.nextInt();

    System.out.print("Masukkan sisi2: ");
    sisi2 = input.nextInt();

    double sisiMiring = Math.sqrt(sisi1 * sisi1 + sisi2 * sisi2);
    
    keliling = sisi1 + sisi2 + sisiMiring;

    System.out.println("keliling segitiga siku siku = " + keliling + "cm");
    input.close();
    }
}
