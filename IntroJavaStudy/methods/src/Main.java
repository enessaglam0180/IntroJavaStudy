public class Main {

    public static void main(String[] args) {
        sayiBulma();
    }

    //camel casing
    public static void sayiBulma() {
        int[] sayilar = {5, 8, 9, 4, 2};
        int aranacak = 6;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (aranacak == sayi) {
                varMi = true;
                break;
            }
        }
        String mesaj=" ";
        if (varMi) {
            mesaj="Sayı dizide vardır: "+aranacak;
            mesajVer(mesaj);
        } else {
            System.out.println(" Sayı dizide yoktur: "+aranacak);
        }

    }
public static void mesajVer(String mesaj){
        System.out.println(mesaj);
}
}

