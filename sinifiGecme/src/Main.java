import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,biyoloji,turkce;
        Scanner scanner=new Scanner(System.in);
        System.out.println("matematik notunuzu giriniz:");
        mat= scanner.nextInt();
        System.out.println("fizik notunuzu giriniz:");
        fizik= scanner.nextInt();
        System.out.println("kimya notunuzu giriniz:");
        kimya= scanner.nextInt();
        System.out.println("biyoloji notunuzu giriniz:");
        biyoloji= scanner.nextInt();
        System.out.println("türkçe notunuzu giriniz:");
        turkce= scanner.nextInt();
        double ortalama=(mat+fizik+kimya+biyoloji+turkce)/5;
        if (ortalama<50){
            System.out.println(" sınıfta kaldınız ort:" +ortalama);
        }else {
            System.out.println("tebrikler sınıfı geçtiniz ort:" + ortalama);
        }
    }
}