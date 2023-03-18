package bg.tu_varna.sit.singleton.v4;

/*
* За да се реши проблема при работа в многонишова среда Бил Пю измисли различен подход за създаване на сингълтън клас,
* използвайки вътрешен статичен помощен клас.
*
* Това е най-разпространения подход
* */
public class BillPughSingleton {
    private BillPughSingleton(){}

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE
                = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
