package ebobEkokBulma;

import java.util.Scanner;

public class odevEbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = input.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = input.nextInt();

        
        int ebob = 0;
        int i = 1;
        while (i <= sayi1 && i <= sayi2) {
            
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        int ekok = (sayi1 * sayi2) / ebob;

        System.out.println(sayi1+" ve "+sayi2+"'in EBOB'u: " + ebob);
        System.out.println(sayi1+" ve "+sayi2+"'in EKOK'u: " + ekok);



    }
}
