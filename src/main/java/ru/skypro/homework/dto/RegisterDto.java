package ru.skypro.homework.dto;

import lombok.Data;

/**
 * Класс для регистрации пользователя
 * */
@Data
public class RegisterDto {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
    private Role role;

}
