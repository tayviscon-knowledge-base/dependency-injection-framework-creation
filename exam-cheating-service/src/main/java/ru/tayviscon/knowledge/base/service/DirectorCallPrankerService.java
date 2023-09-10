package ru.tayviscon.knowledge.base.service;

import ru.tayviscon.knowledge.base.domain.model.Teacher;

/**
 * Сервис, осуществляющий розыгрыш, имитирующий звонок от вышестоящего руководства.
 *
 * @author Tyomych Tovkach.
 */
public class DirectorCallPrankerService implements PrankerService {

    /**
     * Метод осуществляющий вызов преподавателю о лица вышестоящего руководства.
     *
     * @param teacher - преподаватель.
     */
    @Override
    public void prank(Teacher teacher) {
        System.out.printf("%s %s, быстро ко мне, иначе уволю!\n", teacher.getFirstName(), teacher.getPatronymic());
    }
}
