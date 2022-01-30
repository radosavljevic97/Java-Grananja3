//Napisati program koji na osnovu unete godine i meseca ispisuje koliko taj mesec ima dana.

package Domaci3011;

import java.util.Objects;
import java.util.Scanner;

public class Grananja3 {
    public static void main(String[] args) {

        System.out.print("Unesite godinu ");
        Scanner s = new Scanner(System.in);
        int godina = s.nextInt();
        boolean prestupna = godina % 4 == 0;

        System.out.print("Unesite mesec: ");
        Scanner m = new Scanner(System.in);
        String mesec = m.nextLine();

        if(Objects.equals(mesec, "Januar")){
            System.out.print("Januar ima 31 dan.");
        }
        else if(Objects.equals(mesec, "Februar")){
            if (prestupna){
                System.out.print("Februar ima 29 dana.");
            }
            else {
                System.out.print("Februar ima 28 dana.");
            }
        }
        else if(Objects.equals(mesec, "Mart")){
            System.out.print("Mart ima 31 dan.");
        }
        else if(Objects.equals(mesec, "April")){
            System.out.print("April ima 30 dana.");
        }
        else if(Objects.equals(mesec, "Maj")){
            System.out.println("Maj ima 31 dan.");
        }
        else if(Objects.equals(mesec, "Jun")){
            System.out.print("Jun ima 30 dana.");
        }
        else if(Objects.equals(mesec, "Jul")){
            System.out.print("Jul ima 31 dan.");
        }
        else if(Objects.equals(mesec, "Avgust")){
            System.out.print("Avgust ima 31 dan.");
        }
        else if(Objects.equals(mesec, "Septembar")){
            System.out.print("Septembar ima 30 dana.");
        }
        else if(Objects.equals(mesec, "Oktobar")){
            System.out.print("Oktobar ima 31 dan.");
        }
        else if(Objects.equals(mesec, "Novembar")){
            System.out.print("Novembar ima 30 dana.");
        }
        else if(Objects.equals(mesec, "Decembar")){
            System.out.print("Decembar ima 31 dan.");
        }
        else{
            System.out.print("Pokusavjte ponovo.");
        }













    }
}


