package ru.tayviscon.knowledge.base.service;

import ru.tayviscon.knowledge.base.domain.model.Student;

import java.util.List;

/**
 * Сервис, осуществляющий рассылку сообщений на телефонные номера.
 *
 * @author Tyomych Tovkach.
 */
public class PhoneNumberMessageSenderService implements MessageSenderService {

    /**
     * Метод осуществляющий рассылку сообщений на телефонные номера.
     *
     * @param students - студенты.
     */
    @Override
    public void send(List<Student> students) {
        for (Student student : students) {
            System.out.printf("Направляю на телефонный номер ответы студенту  %s\n", student.getLastName());
        }
    }
}
