package com.rkaneko.spring.ddd.application.usecase.users;

import com.rkaneko.spring.ddd.domain.core.Usecase;
import com.rkaneko.spring.ddd.domain.vo.User;
import com.rkaneko.spring.ddd.domain.vo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public final class GetUsersUsecase implements Usecase<User, GetUsersOutputForm> {
    @Autowired
    private GetUsersPresenter getUsersPresenter;

    @Override
    public GetUsersOutputForm execute(User user) {
        // TODO use repositories or domain services
        List<User> users = new ArrayList<>(Collections.singletonList(user));

        return getUsersPresenter.callback(new Users(users));
    }
}
