package pertemuan2;

public class Segitiga {
    public static void main(String[] args) {
        //nomor 5
        int a = 6, b = 8;
        double luas = 0.5 * a * b;
        
        //luas
        System.out.println("Luas Segitiga : " + luas);
        
        //nomor 6
        double c = Math.sqrt((a * a) + (b * b));
        double keliling = a + b + c;
        
        //nilai c dan keliling 
        System.out.println("\nNilai C : " + c);
        System.out.println("Keliling Segitiga : " + keliling);
    }
}
