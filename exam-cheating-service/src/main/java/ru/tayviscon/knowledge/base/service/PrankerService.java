package ru.tayviscon.knowledge.base.service;

import ru.tayviscon.knowledge.base.domain.model.Teacher;

/**
 * Интерфейс, определяющий общее поведение для всех сервисов, осуществляющих розыгрыш.
 *
 * @author Tyomych Tovkach.
 */
public interface PrankerService {

    /**
     * Метод осуществляющий розыгрыш преподавателя.
     *
     * @param teacher - преподаватель.
     */
    void prank(Teacher teacher);

}
