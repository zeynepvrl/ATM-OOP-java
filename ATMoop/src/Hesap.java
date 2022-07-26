public class Hesap {
    private String kullanıcı_adı;
    private String parola;
    private double bakiye;

    public Hesap(String kullanıcı_adı, String parola, double bakiye) {   //Hesap  ın Constractor u
        this.kullanıcı_adı = kullanıcı_adı;
        this.parola=parola;
        this.bakiye=bakiye;
    }

    public String getKullanıcı_adı() {
        return kullanıcı_adı;
    }

    public void setKullanıcı_adı(String kullanıcı_adı) {
        this.kullanıcı_adı = kullanıcı_adı;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    public void parayatır(int tutar){
        bakiye+=tutar;
        System.out.println("Yeni bakiyeniz:"+bakiye);
    }
    public void paracek(int tutar){
        if(bakiye<tutar){
            System.out.println("Yetersiz bakiye");
        }
        else{
            bakiye-=tutar;
            System.out.println("Yeni bakiye:"+bakiye);
        }
    }
}



















