package com.oguzhan.bektas.efectivejava.item16;

public class Takım {
    /*
    1--> Doğrudan erişimi tek private alan yap.
    2--> Get setlerde kontrol sağlıyabiliriz.
    3--> İstersek set ile iletişimi kesip Read-only yapabiliriz.
    4--> write only de aynı şekilde
    5--> Data hiding Veri saklama
     */
    private String takimAdi;
    private int takimOyuncuSayisi;

    public Takım(String takimAdi, int takimOyuncuSayisi) {
        this.takimAdi = takimAdi;
        this.takimOyuncuSayisi = takimOyuncuSayisi;
    }

    public String getTakimAdi() {
        return takimAdi;
    }

    public void setTakimAdi(String takimAdi) {
        this.takimAdi = takimAdi;
    }

    public int getTakimOyuncuSayisi() {
        return takimOyuncuSayisi;
    }

    public void setTakimOyuncuSayisi(int takimOyuncuSayisi) {
        if (takimOyuncuSayisi < 0) {
            this.takimOyuncuSayisi = 0;
        } else {
            this.takimOyuncuSayisi = takimOyuncuSayisi;
        }
    }
}
