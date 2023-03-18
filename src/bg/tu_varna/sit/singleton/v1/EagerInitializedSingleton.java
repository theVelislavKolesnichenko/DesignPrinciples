package bg.tu_varna.sit.singleton.v1;

/*
* При нетърпеливата инициализация инстанцията на класа singleton се създава по време на зареждането на класа.
*
* Недостатъкът на нетърпеливата инициализация е, че методът е създаден, въпреки че клиентското приложение може
* да не го използва.
*
* Ако вашият сингълтън клас не използва много ресурси, това е подходът, който трябва да използвате.
* Но в повечето сценарии singleton класовете се създават за ресурси като файлова система, връзки с бази данни и др.
* Трябва да избягваме инстанцията, освен ако клиентът не извика метода. Също така, този метод не предоставя никакви
* опции за обработка на изключения.
* */
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance =
            new EagerInitializedSingleton();

    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
