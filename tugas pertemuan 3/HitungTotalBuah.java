package pertemuan3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HitungTotalBuah {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        
        System.out.print("Masukkan Jumlah Mangga            : ");
        int mangga = Integer.parseInt(br.readLine());
        
        System.out.print("Masukkan Jumlah Mangga yang Busuk : ");
        int manggabsk = Integer.parseInt(br.readLine());
        
        System.out.print("Masukkan Jumlah Tetangga          : ");
        int tetangga = Integer.parseInt(br.readLine());
        
        System.out.print("Masukkan Jumlah Jambu /tetangga   : ");
        int jambu = Integer.parseInt(br.readLine());
        
        int totmangga = mangga - manggabsk;
        int totjambu = tetangga * jambu;
        int totbuah = totmangga + totjambu;
        
        System.out.println("\n== TOTAL BUAH YANG DIBELI ==");
        System.out.println("Mangga                 : " + totmangga + "pcs");
        System.out.println("Jambu untuk tetangga   : " + totjambu + "pcs");
        System.out.println("Total buah yang dibeli : " + totbuah + "pcs");
    }
}
