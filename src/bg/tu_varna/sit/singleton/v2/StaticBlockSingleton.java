package bg.tu_varna.sit.singleton.v2;

/*
*Реализацията на инициализацията на статичния блок е подобна на нетърпеливата инициализация, с изключение на това,
* че инстанцията на класа се създава в статичния блок, който предоставя опцията за обработка на изключения.
*
* Както нетърпеливата инициализация, така и инициализацията на статичния блок създават инстанцията още преди да се
* използва и това не е най-добрата практика за използване.
* */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){}

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

    public void open() {

    }

    public void save(String message) {

    }
}
