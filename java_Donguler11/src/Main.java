import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        int say = input.nextInt();
        int eb=0, ek=999999999;
        for (int i=1; i<=say;i++){
            System.out.print(i+".sayiyi girin:");
            int sayi= input.nextInt();

            if (eb<sayi){
                eb=sayi;
            }
            if (ek>sayi){
                ek=sayi;
            }
        }
        System.out.println("en buyuk sayi:"+eb);
        System.out.print("en kucuk sayi:"+ek);
    }
}
