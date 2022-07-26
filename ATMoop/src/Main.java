public class Main {
    public static void main(String[] args) {
        ATM atm=new ATM();
        Hesap hesap=new Hesap("Zeynep","12345",0.0);
        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor..");
    }
}