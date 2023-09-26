package ru.tayviscon.knowledge.base.infrastructure;

/**
 * Интерфейс конфигурации приложения.
 *
 * @author Tyomych Tovkach.
 */
public interface Config {

    /**
     * Метод получения класса, который реализует заданный интерфейс.
     *
     * @param ifc интерфейс.
     * @param <T> тип интерфейса.
     * @return класс, реализующий интерфейс.
     */
    <T> Class<? extends T> getImplClass(Class<T> ifc);

}
