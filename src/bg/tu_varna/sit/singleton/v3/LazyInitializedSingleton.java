package bg.tu_varna.sit.singleton.v3;

/*
* Мързеливият метод за инициализация за реализиране на шаблона singleton създава инстанцията в метода за глобален достъп.
*
* Предишната реализация работи добре в случая на еднонишковата среда, но когато става въпрос за многонишкови системи,
* това може да причини проблеми, ако няколко нишки са вътре в състоянието едновременно.
* Това ще унищожи singleton модел и двете нишки ще получат различни случаи на singleton клас.
*
* */
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
