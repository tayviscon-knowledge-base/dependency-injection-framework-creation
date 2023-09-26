package ru.tayviscon.knowledge.base.infrastructure;

/**
 * Фабрика объектов.
 *
 * @author Tyomych Tovkach.
 */
public class ObjectFactory {

    /**
     * Экземпляр класса ObjectFactory.
     */
    private static ObjectFactory instance = new ObjectFactory();
    private Config config;

    /**
     * Метод получения экземпляра класса ObjectFactory.
     *
     * @return экземпляр класса ObjectFactory.
     */
    public static ObjectFactory getInstance() {
        return instance;
    }

    /**
     * Конструктор класса.
     */
    private ObjectFactory() {
    }

    /**
     * Метод, создающий объекты в зависимости от типа класса, пришедшего в параметре.
     *
     * @param type класс.
     * @param <T>  тип класса.
     * @return объект типа T.
     */
    public <T> T createObject(Class<T> type) {
        //TODO: написать логику метода.
    }

}
