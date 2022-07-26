import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap){   //bütün işlemleri bunun içinde gerçekleştiricez
        Login login=new Login();
        Scanner sc=new Scanner(System.in);
        System.out.println("BANKAMIZA HOŞGELDİNİZ..");
        System.out.println("********************************");
        System.out.println("KULLANICI GİRİŞİ");
        System.out.println("*********************************");
        int giris_hakkı=3;
        while(true){
            if(login.login(hesap)){
                System.out.println("Giriş başarılı..");
                break;
            }
            else{
                System.out.println("Giriş başarısız");
                giris_hakkı-=1;
                System.out.println("Kalan giriiş hakkı:"+giris_hakkı);
            }
            if(giris_hakkı==0){
                System.out.println("Giriş hakkınız bitti");
                return; //  sadece döngü değil method sonlansın diye
            }
        }
        System.out.println("***********************************");
        System.out.println("1. işlem: Bakiye öğrenme\n" +
                "2. işlem: para yatırma\n" +
                "3. işlem: para çekme\n" +
                "çıkış için q a basın");
        System.out.println("**************************************");
        while(true){
            System.out.println("işlem seçiniz:");
            String islem=sc.nextLine();
            if(islem.equals("q")){
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz:"+hesap.getBakiye());
            }
            else if(islem.equals("2")){
                System.out.println("Yatırmak istediğiniz tutar:");
                int tutar=sc.nextInt();
                sc.nextLine();
                hesap.parayatır(tutar);
            }
            else if(islem.equals("3")){
                System.out.println("Çekmek istediğiniz tutar");
                int tutar=sc.nextInt();
                sc.nextLine();
                hesap.paracek(tutar);
            }
            else{
                System.out.println("Geçersiz işlem..");
            }
        }

    }


}
