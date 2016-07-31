package com.rkaneko.spring.ddd.application.usecase.users;

import com.rkaneko.spring.ddd.domain.core.InputPort;
import com.rkaneko.spring.ddd.domain.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GetUsersController implements InputPort<GetUsersInputForm, GetUsersOutputForm> {

    @Autowired
    private GetUsersUsecase getUsersUsecase;

    @RequestMapping("/api/users/get")
    @Override
    public GetUsersOutputForm run(GetUsersInputForm inputForm) {
        // TODO convert inputForm
        User user = new User();
        user.setId(1L);
        user.setName("Bob");
        return getUsersUsecase.execute(user);
    }
}
