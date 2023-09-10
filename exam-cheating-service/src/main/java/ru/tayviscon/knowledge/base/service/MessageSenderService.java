package ru.tayviscon.knowledge.base.service;

import ru.tayviscon.knowledge.base.domain.model.Student;

import java.util.List;

/**
 * Интерфейс, определяющий общее поведение для всех сервисов, осуществляющих рассылку сообщений.
 *
 * @author Tyomych Tovkach.
 */
public interface MessageSenderService {

    /**
     * Метод, осуществляющий рассылку сообщений студентам.
     *
     * @param students - студенты.
     */
    void send(List<Student> students);

}
