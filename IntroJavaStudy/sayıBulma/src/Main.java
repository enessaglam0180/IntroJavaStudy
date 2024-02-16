public class Main {

    public static void main(String[] args) {
        int[] sayilar = {5, 8, 9, 4, 2};
        int aranacak=15;
        for (int sayi : sayilar) {
            if (aranacak == sayi) {
                System.out.println(aranacak + " dizinin içinde vardır");
            }else{
                System.out.println(aranacak+" dizinin içinde yoktur");
                return;
            }
        }
    }
}
