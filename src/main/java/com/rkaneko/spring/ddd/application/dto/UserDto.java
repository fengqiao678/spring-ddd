package com.rkaneko.spring.ddd.application.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public final class UserDto {
    private long id;
    private String name;
}
