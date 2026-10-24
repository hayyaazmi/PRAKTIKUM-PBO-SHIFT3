//nomor 5
package pertemuan4;
import java.util.Scanner;

public class HitungPendapatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataSales ds = new DataSales();
        
        System.out.print("Masukkan Total Penjualan : ");
        ds.penjualan = input.nextDouble();
        
        ds.hitungPendapatan();
        ds.info();
    }
}

class DataSales{
    double penjualan, komisi, uangJasa, pendapatan;
    
    void hitungPendapatan(){
        if(penjualan <= 2000000){
            uangJasa = 100000;
            komisi =  penjualan * 0.10;
        } else if(penjualan <= 5000000){
            uangJasa = 200000;
            komisi = penjualan * 0.15;
        } else {
            uangJasa = 300000;
            komisi = penjualan * 0.20;
        }
        pendapatan = uangJasa + komisi;
    }
    
    void info() {
        System.out.println("\n== PENDAPATAN SALESMAN ==");
        System.out.println("Hasil Penjualan  : " + penjualan);
        System.out.println("Uang Jasa        : " + uangJasa);
        System.out.println("Komisi           : " + komisi);
        System.out.println("Total Pendapatan : " + pendapatan);
    }
}
