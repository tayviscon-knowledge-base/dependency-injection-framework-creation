package ru.tayviscon.knowledge.base.infrastructure;

import org.reflections.Reflections;

import java.util.Set;

/**
 * Конфигурации приложения на основании Java-кода.
 *
 * @author Tyomych Tovkach.
 */
public class JavaConfig implements Config {

    private Reflections scanner;

    /**
     * Конструктор класса.
     *
     * @param packageToScan пакет, с которого необходимо начинать сканирование.
     */
    public JavaConfig(String packageToScan) {
        this.scanner = new Reflections(packageToScan);
    }

    /**
     * Метод получения класса, который реализует заданный интерфейс.
     *
     * @param ifc интерфейс.
     * @param <T> тип интерфейса.
     * @return класс, реализующий интерфейс.
     */
    @Override
    public <T> Class<? extends T> getImplClass(Class<T> ifc) {
        Set<Class<? extends T>> classes = scanner.getSubTypesOf(ifc);
        if (classes.size() != 1) {
            throw new RuntimeException(ifc + " has zero or more than one implementations");
        }
        return classes.iterator().next();
    }
}
