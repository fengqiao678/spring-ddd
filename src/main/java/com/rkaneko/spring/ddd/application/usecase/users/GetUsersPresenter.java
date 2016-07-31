package com.rkaneko.spring.ddd.application.usecase.users;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.rkaneko.spring.ddd.application.dto.UserDto;
import com.rkaneko.spring.ddd.domain.core.OutputPort;
import com.rkaneko.spring.ddd.domain.vo.User;
import com.rkaneko.spring.ddd.domain.vo.Users;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
class GetUsersPresenter implements OutputPort<Users, GetUsersOutputForm> {

    @Override
    public GetUsersOutputForm callback(Users args) {
        GetUsersOutputForm outputForm = new GetUsersOutputForm();
        outputForm.setUsers(convertList(args));
        return outputForm;
    }

    private List<UserDto> convertList(Users users) {
        return users.stream().map(this::convert).collect(toList());
    }

    @VisibleForTesting
    UserDto convert(User user) {
        Preconditions.checkNotNull(user);

        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        return userDto;
    }
}
