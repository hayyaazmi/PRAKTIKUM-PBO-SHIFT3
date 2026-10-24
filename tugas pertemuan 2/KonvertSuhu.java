package pertemuan2;

public class KonvertSuhu {
    public static void main(String[] args) {
        double c = 10, f = 15, r = 5;
    
        System.out.println("a. Celcius Ke Fahrenheit dan Sebaliknya");
        System.out.println("Celcius   : " + c + " -> Fahrenheit: " + ((c * 9/5) + 32));
        System.out.println("Fahrenheit: " + f + " -> Celcius   : " + ((f - 32) * 5/9));
        
        System.out.println("\nb. Celcius Ke Reamur dan Sebaliknya");
        System.out.println("Celcius: " + c + " -> Reamur  : " + (c * 4/5));
        System.out.println("Reamur : " + r + " -> Celcilius: " + (r * 5/4));
        
        System.out.println("\nc. Fahrenheit Ke Reamur dan Sebaliknya");
        System.out.println("Fahrenheit: " + f + " -> Reamur   : " + ((f - 32) * 4/9));
        System.out.println("Reamur    : " + r + " -> Fahrenheit: " + ((r * 9/4) + 32));
    }
}
