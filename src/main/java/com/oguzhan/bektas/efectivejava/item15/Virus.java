package com.oguzhan.bektas.efectivejava.item15;

public class Virus {

    public String virus(){
        String virusUrl="aa";
//        GuvenliKod.NEWS_SITES[0]=virusUrl;
        GuvenliKod.haberleriAl(virusUrl);
        return "";
    }

    /*
    public static yerine private yap
    sonrasında Collections.unmodifiableList ile başka bir static e ata.

     */
}
