package pertemuan3;
import java.util.Scanner;

public class SelisihWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //waktu pertama
        System.out.println("== WAKTU PERTAMA ==");
        System.out.print("Jam   : ");
        int jam1 = input.nextInt();
        
        System.out.print("Menit : ");
        int menit1 = input.nextInt();
        
        System.out.print("Detik : ");
        int detik1 = input.nextInt();
        
        //waktu kedua
        System.out.println("== WAKTU KEDUA ==");
        System.out.print("Jam   : ");
        int jam2 = input.nextInt();
        
        System.out.print("Menit : ");
        int menit2 = input.nextInt();
        
        System.out.print("Detik : ");
        int detik2 = input.nextInt();
        
        //konversi jam dan menit ke detik
        int totdetik1 = (jam1 * 3600) + (menit1 * 60) + detik1;
        int totdetik2 = (jam2 * 3600) + (menit2 * 60) + detik2;
        
        int selisihdetik = Math.abs(totdetik2 - totdetik1);
        
        //konversi kembali ke jam, menit, dan detik
        int selisihjam = selisihdetik / 3600;
        int sisadetik  = selisihdetik % 3600;
        int selisihmenit = sisadetik / 60;
        int akhirdetik = sisadetik % 60;
        
        System.out.println("\n== SELISIH WAKTU 1 DAN 2 ==");
        System.out.println("Selisih Waktu : " + selisihjam + " jam, " + selisihmenit + " menit, " + akhirdetik + " detik");
    }
}
