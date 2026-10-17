package pertemuan3;
import java.util.Scanner;

public class WaktuCetakNovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Novel        : ");
        int jmlnovel = input.nextInt();
        
        System.out.print("Masukkan Tebal Lembar /novel : ");
        int tblnovel = input.nextInt();
        
        long totlembar = (long) jmlnovel * tblnovel;
        long totdetik = totlembar;
        
        long hari = totdetik / 86400;
        totdetik = totdetik % 86400;
       
        long jam = totdetik / 3600;
        totdetik = totdetik % 3600;
       
        long menit = totdetik / 60;
        long detik = totdetik % 60;
       
        System.out.println("\n== WAKTU PENCETAKAN NOVEL ==");
        System.out.println("Jumlah Novel     : " + jmlnovel);
        System.out.println("Lemmbar /Novel   : " + tblnovel);
        System.out.println("Total Lembar     : " + totlembar);
        System.out.println("Waktu Diperlukan : " + hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik");
    }
}
