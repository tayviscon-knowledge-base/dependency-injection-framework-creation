package ru.tayviscon.knowledge.base.domain.model;

import lombok.Data;

import java.util.UUID;

/**
 * Модель Преподавателя.
 *
 * @author Tyomych Tovkach
 */
@Data
public class Teacher {

    /**
     * Уникальный идентификатор.
     */
    private UUID id;

    /**
     * Фамилия.
     */
    private String lastName;

    /**
     * Имя.
     */
    private String firstName;

    /**
     * Отчество.
     */
    private String patronymic;

    /**
     * Дополнительные сведения.
     */
    private String additionalInformation;

}
