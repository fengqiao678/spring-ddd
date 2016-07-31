package com.rkaneko.spring.ddd.application.usecase.users;

import com.rkaneko.spring.ddd.application.dto.UserDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public final class GetUsersOutputForm {
    private List<UserDto> users;
}
