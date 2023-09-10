package ru.tayviscon.knowledge.base.service;

import ru.tayviscon.knowledge.base.domain.model.Student;
import ru.tayviscon.knowledge.base.domain.model.Teacher;

import java.util.List;

/**
 * Сервис, помогающий студентам списывать на экзамене.
 *
 * @author Tyomych Tovkach
 */
public class ExamCheatingService {

    private PrankerService prankerService = new DirectorCallPrankerService();
    private MessageSenderService messageSenderService = new PhoneNumberMessageSenderService();

    /**
     * Основной метод сервиса.
     *
     * @param teacher  преподаватель, которого необходимо отвлечь.
     * @param students студенты, которым необходимо разослать ответы.
     */
    public void start(Teacher teacher, List<Student> students) {
        prankerService.prank(teacher);
        messageSenderService.send(students);
    }

}
