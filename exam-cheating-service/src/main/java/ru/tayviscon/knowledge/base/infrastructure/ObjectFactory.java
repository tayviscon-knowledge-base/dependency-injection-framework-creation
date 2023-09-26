package ru.tayviscon.knowledge.base.infrastructure;

import lombok.SneakyThrows;

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
    private Config config = new JavaConfig("ru.tayviscon");

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
    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        Class<? extends T> implClass = type;
        if (type.isInterface()) {
            implClass = config.getImplClass(type);
        }
        T t = implClass.getDeclaredConstructor().newInstance();

        //TODO: вся магия по настройке объекта будет здесь

        return t;
    }

}
