package ru.tayviscon.knowledge.base;

import ru.tayviscon.knowledge.base.domain.model.Student;
import ru.tayviscon.knowledge.base.domain.model.Teacher;
import ru.tayviscon.knowledge.base.service.ExamCheatingService;

import java.util.List;

/**
 * Главный класс приложения.
 *
 * @author Tyomych Tovkach
 */
public class Main {

    /**
     * Точка входа в приложение.
     *
     * @param args аргументы.
     */
    public static void main(String[] args) {
        ExamCheatingService examCheatingService = new ExamCheatingService();
        Teacher teacher = new Teacher();
        teacher.setFirstName("Алёна");
        teacher.setPatronymic("Владимировна");
        Student student = new Student();
        student.setLastName("Иванов");
        examCheatingService.start(teacher, List.of(student));
    }

}
