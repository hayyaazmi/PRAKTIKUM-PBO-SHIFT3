//nomor 3
package pertemuan4;
import java.util.Scanner;

public class HitungGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataKaryawan d = new DataKaryawan();
        
        System.out.print("Masukan NIK  : ");
        d.nik = input.nextLine();
        System.out.print("Masukan Nama : ");
        d.nama = input.nextLine();
        
        System.out.println("");
        System.out.println("Informasi Kode Golongan : ");
        System.out.println("Kode 1: Menikah");
        System.out.println("Kode 2: Belum Menikah");
        System.out.println("Kode 3: Cerai");
        System.out.println("Kode 4: Menikah dan punya anak");
        System.out.print("Masukan Kode Golongan : ");
        d.kodeGol = input.nextInt();
        
        if(d.kodeGol == 4){
            System.out.print("Masukan Jumlah Anak : ");
            d.anak = input.nextInt();
        }
        
        d.menentukanGaji();
        d.hitungTunjangan();
        d.hitungGajiBersih();
        d.info();
    }
}

class DataKaryawan {
    String nik, nama, statusNikah;
    int kodeGol;
    int anak;
    double gajiPokok, tunjangan, tunjPasangan, tunjAnak, gajiBersih;
    
    
    void menentukanGaji(){
        switch(kodeGol){
            case 1:
                statusNikah = "Menikah";
                gajiPokok = 1200000;
                break;
            case 2: 
                statusNikah = "Belum Menikah";
                gajiPokok = 1500000;
                break;
            case 3:
                statusNikah = "Cerai";
                gajiPokok = 1750000;
                break;
            case 4:
                statusNikah = "Menikah dan Punya Aanak";
                gajiPokok = 2000000;
                break;
            default:
                statusNikah = "Data Tidak Valid";
                gajiPokok = 0;
        }
    }
    
    void hitungTunjangan() {
        if(kodeGol == 1 || kodeGol == 4){
            tunjPasangan = gajiPokok * 0.10;
        }
        if(kodeGol == 4){
            tunjAnak = gajiPokok * anak * 0.05;
        }
        tunjangan = tunjPasangan + tunjAnak;
    }
    
    void hitungGajiBersih(){
        gajiBersih = gajiPokok + tunjangan;
    }
    
    void info(){
        System.out.println("\n== GAJI KARYAWAN ==");
        System.out.println("NIK                : " + nik);
        System.out.println("Nama               : " + nama);
        System.out.println("Status             : " + statusNikah);
        System.out.println("Jumlah Anak        : " + anak);
        System.out.println("Gaji Pokok         : " + gajiPokok);
        System.out.println("Tunjangan Pasangan : " + tunjPasangan);
        System.out.println("Tunjangan Anak     : " + tunjAnak);
        System.out.println("Total Tunjangan    : " + tunjangan);
        System.out.println("Gaji Bersih        : " + gajiBersih);
    }
}
