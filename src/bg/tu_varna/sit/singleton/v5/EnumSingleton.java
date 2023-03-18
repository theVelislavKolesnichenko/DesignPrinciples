package bg.tu_varna.sit.singleton.v5;

/*
* Тъй като стойностите на Java Enum са глобално достъпни, такъв е и сингълтонът.
*
* Недостатъкът е, че типът е малко негъвкав
* (например, не позволява мързелива инициализация).
* */
public enum EnumSingleton {
    INSTANCE("connect");

    EnumSingleton(String s) {
    }

    public static void doSomething() {
        // do something
    }
}
