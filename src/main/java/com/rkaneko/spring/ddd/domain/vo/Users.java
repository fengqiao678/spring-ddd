package com.rkaneko.spring.ddd.domain.vo;

import com.google.common.base.Preconditions;
import com.google.common.collect.ForwardingList;
import com.google.common.collect.ImmutableList;

import java.util.List;

public final class Users extends ForwardingList<User> {

    private List<User> delegate;

    public Users(List<User> users) {
        Preconditions.checkNotNull(users);

        delegate = users;
    }

    @Override
    protected List<User> delegate() {
        return ImmutableList.copyOf(delegate);
    }
}
