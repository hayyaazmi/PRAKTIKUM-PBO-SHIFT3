package pertemuan3;
import java.util.Scanner;

public class HitungGajiBersih {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Karyawan k1 = new Karyawan();
        
        System.out.print("Masukkan Nomor Induk Karyawan       : ");
        k1.nomor = input.nextLine();
        
        System.out.print("Masukkan Nama Karyawan              : ");
        k1.nama = input.nextLine();
        
        System.out.print("Mauskkan Alamat Karyawan            : ");
        k1.alamat = input.nextLine();
        
        System.out.print("Masukkan Jabatan Karyawan           : ");
        k1.jabatan = input.nextLine();
        
        System.out.print("Masukkan Gaji Pokok Karyawan        : ");
        k1.gaji = input.nextDouble();
        
        System.out.print("Masukkan Tunjangan Jabatan Karyawan : ");
        k1.tjabatan = input.nextDouble();
        
        System.out.print("Masukkan Tunjangan Istri Karyawan   : ");
        k1.tistri = input.nextDouble();
        
        System.out.print("Masukkan Tunjangan Anak Karyawan    : ");
        k1.tanak = input.nextDouble();
        
        System.out.println("\n== GAJI BERSIH PEGAWAI ==");
        k1.info();
    }
}

class Karyawan {
    String nomor, nama, alamat, jabatan;
    double gaji, tjabatan, tistri, tanak;
    
    double hitungTotGaji() {
        return gaji + tjabatan + tistri + tanak;
    }
    
    double hitungPajak() {
        return (gaji + tjabatan + tanak) * 0.10;
    }
    
    void info() {
        double totgaji = hitungTotGaji();
        double pph = hitungPajak();
        
        System.out.println("Nomor Induk Karyawan : " + nomor);
        System.out.println("Nama Karyawan        : " + nama);
        System.out.println("Alamat               : " + alamat);
        System.out.println("Jabatan              : " + jabatan);
        System.out.println("Gaji Pokok           : " + gaji);
        System.out.println("Tunjangan Jabatan    : " + tjabatan);
        System.out.println("Tunjangan Istri      : " + tistri);
        System.out.println("Tunjangan Anak       : " + tanak);
        System.out.println("Total Gaji           : " + totgaji);
        System.out.println("Pajak Penghasilan    : " + pph);
        System.out.println("Gaji Bersih          : " + (totgaji - pph));
    }
}
