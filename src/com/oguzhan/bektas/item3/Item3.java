package com.oguzhan.bektas.item3;

public class Item3 {

    /**
     * Enforce the singleton property with a private constructor or an enum type
     * <p>
     * Singleton özelliğini nasıl yapalım ?
     */


    public static void main(String[] args) {

        /**
         *  Aşağıdaki şekilde sonsuze kadar instance üretebilirim fakar bu Singletona ters bir olay
         *  Singleton: Bir sınıfın sadece bir tane instance ı olmalıdır. Temel prensibi bu.
         *  Constructor ını private yaparsak aşağıdaki kod parçacıklarına erişemeyiz.
         */

//        DefineSingleton ds = new DefineSingleton();
//        DefineSingleton ds2 = new DefineSingleton();
//        DefineSingleton ds3 = new DefineSingleton();

        // Artık böyle çağırabiliyoruz fakat bu da yanlış bir yöntem karar değiştirme ihtimalimiz var static facytory metod ile yapın.
        DefineSingleton ds = DefineSingleton.ds;
        DefineSingleton ds2 = DefineSingleton.getInstance();

        System.out.println(ds.hashCode());
        System.out.println(ds2.hashCode());

        // Singleton çeşitleri
        // Lazy tembel - Sadece çağrılırsa instance ı oluşturuyor
        // Eager sabırsız - static oluştururken newliyoruz çağrılmasa bile oluşturulur.
        // Cache enum

        new Thread(() -> {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {

            }
            System.out.println("Hashcode of Lazy --> " + LazyCache.getInstance().hashCode());
            System.out.println("Hashcode of Eager --> " + EagerCache.getInstance().hashCode());
            System.out.println("Hashcode of Enum --> " + CacheSingleton.INSTANCE.hashCode());
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hashcode of Lazy --> " + LazyCache.getInstance().hashCode());
                System.out.println("Hashcode of Eager --> " + EagerCache.getInstance().hashCode());
                System.out.println("Hashcode of Enum --> " + CacheSingleton.INSTANCE.hashCode());
            }
        }).start();

        // Lazy --> 2 thread aynı anda girdiğinde farklı instance oluşturuyor. X
        // Eager ve enum da bu okey. Eager da ihtiyacınız olmasa bir heap de yer ayırıyor. Ram açısından sıkıntı.
    }
}
