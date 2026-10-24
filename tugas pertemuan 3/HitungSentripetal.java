package pertemuan3;
import java.util.Scanner;

public class HitungSentripetal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Massa (M)     : ");
        double massa = input.nextDouble();
        
        System.out.print("Masukkan Kecepatan (V) : ");
        double kecepatan = input.nextDouble();
        
        System.out.print("Masukkan Jari-jari (r) : ");
        double jari = input.nextDouble();
        
        //rumus
        double rumusstp = (massa * Math.pow(kecepatan, 2)) / jari;
        
        System.out.println("\n== HASIL PERHTUNGAN ==");
        System.out.println("Massa (M)        : " + massa + "kg");
        System.out.println("Kecepatan (V)    : " + kecepatan + "m/s");
        System.out.println("Jari-jari (r)    : " + jari + "m");
        System.out.println("Gaya Sentripetal : " + rumusstp + " N");
    }
}
