import java.util.Scanner;

public class notOrtalaması {
    public static void main(String[] args) {

        int not=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz:");
        not += input.nextInt();
        System.out.print("Fizik Notunu Giriniz:");
        not += input.nextInt();
        System.out.print("Kimya Notunu Giriniz:");
        not += input.nextInt();
        System.out.print("Türkçe Notunu Giriniz:");
        not += input.nextInt();
        System.out.print("Tarih Notunu Giriniz:");
        not += input.nextInt();
        System.out.print("Müzik Notunu Giriniz:");
        not += input.nextInt();

        double toplam = not / 6;
        System.out.println("Ortalama:"+toplam);

        String durum = (toplam >= 60) ? "Geçti" : "Kaldı";
        System.out.println("Durum: " + durum);

    }
}
