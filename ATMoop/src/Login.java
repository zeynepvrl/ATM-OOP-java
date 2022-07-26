import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap){  //normalde parametre int a falan olurdu burada gönderilenin türü Hesap objesi
        Scanner sc=new Scanner(System.in);
        System.out.println("Kullanıcı Adı:");
        String kullanıcı_adı=sc.nextLine();
        System.out.println("Parolanız:");
        String parola=sc.nextLine();
        if(hesap.getKullanıcı_adı().equals(kullanıcı_adı)&&hesap.getParola().equals(parola)){
            return true;
        }
        else{
            return false;
        }
    }
}
