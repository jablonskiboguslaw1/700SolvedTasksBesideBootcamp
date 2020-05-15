package com.codegym.task.task36.task3608.model;

import com.codegym.task.task36.task3608.bean.User;

import java.util.ArrayList;
import java.util.List;

public class FakeModel implements Model {

    private DataModel dataModel = new DataModel();

    @Override
    public DataModel getDataModel() {
        return dataModel;
    }

    @Override
    public void loadUsers() {
List<User> list = new ArrayList<>();
        list.add(new User("A", 1, 1));
        list.add(new User("B", 2, 4));
        dataModel.setUsers(list);


    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUserById(long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteUserById(long id) { throw new UnsupportedOperationException();

    }


}
