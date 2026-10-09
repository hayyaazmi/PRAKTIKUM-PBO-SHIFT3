package pertemuan2;

public class KecepatanCahaya {
    public static void main(String[] args) {
        double bulan = 384400;
        double matahari = 152100000;
        double kecepatan = 300000;
        
        double waktuBulan = bulan/kecepatan;
        double waktuMatahari = matahari/kecepatan;
        
        System.out.println("Waktu Ke Bulan : " + waktuBulan + " detik");
        System.out.println("Waktu Ke Matahari : " + waktuMatahari + " detik atau " + (waktuMatahari/60) + " menit");
    }
}
