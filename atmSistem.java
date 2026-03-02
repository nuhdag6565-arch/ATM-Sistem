import java.util.Scanner;

public class atmSistem {
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);

      System.out.println("---------------------------------");

      int geirilenSifre = 0;
      int dogruSifre = 1234;
      int hak = 3;
      int yeniSifre;

      do {
         System.out.println("lutfen şifrenizi giriniz:");
         geirilenSifre = s.nextInt();

         if (geirilenSifre != dogruSifre) {
            hak = hak - 1;
            System.out.println("HATA ! ,Yanlış Şifre Girdiniz ");
            System.out.println("Kalan Deneme Hakınız :" + hak);
            System.out.println("----------------------------------");
         }

      } while (geirilenSifre != dogruSifre && hak > 0);

      int secim, paraCekme, paraYatırma;
      int bakiye = 1000;

      if (hak > 0) {

         do {
            System.out.println("--------------------------------------");
            System.out.println("Menu");
            System.out.println("--------------------------------------");
           
            System.out.println("1. Bakiye Sorgulama");
            System.out.println("2. Para Çekme");
            System.out.println("3. Para Yatır");
            System.out.println("4. Şifre Değiştir");
            System.out.println("5. Çıkış");
           
            System.out.println("-------------------------------------");

            System.out.println("yapmak istediğinşz işlemi seçin :");
            secim = s.nextInt();

            if (secim == 1) {

               System.out.println("Bakiyeniz :" + bakiye);

            } else if (secim == 2) {

               System.out.println("Lutfen Çekmek İstediğiniz Tutarı Giriniz:");
               paraCekme = s.nextInt();

               if (paraCekme > bakiye){
                  System.out.println("HATA! Yetersiz Bakiye . Mevcut Paranız :"+bakiye);
              
               }else {

               bakiye = bakiye - paraCekme;

               System.out.println("Baçarılı Bir Şekilde Paranız Çekilidi");
               }

            } else if (secim == 3) {

               System.out.println("Lutfen Yatırmak İsteddiğiniz Tutarı Giriniz :");
               paraYatırma = s.nextInt();

               bakiye = bakiye + paraYatırma;

               System.out.println("Başarılı Bir Şekilde Para Yatırıldı");

            } else if (secim == 4) {
               
               System.out.println("Lutfen Yeni Şifrenizi Giriniz :");
               yeniSifre = s.nextInt();

               dogruSifre = yeniSifre;
              
               System.out.println("Şifreniz Bşarılı Bir Şekilde değiştirildi ");

            }

         } while (secim != 5);

         System.out.println("-------------");
         System.out.println("Çıkış Yapıldı");
         System.out.println("-------------");

      } else {
        
         System.out.println("-----------------------------------------------------------");
         System.out.println("Hakkınız Kalmadı! Kartınız Bloke Oldu, Sistemden Atıldınız.");
         System.out.println("-----------------------------------------------------------");
      }

   }
}
    

