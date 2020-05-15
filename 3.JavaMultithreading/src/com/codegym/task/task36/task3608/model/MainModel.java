package com.codegym.task.task36.task3608.model;

import com.codegym.task.task36.task3608.bean.User;
import com.codegym.task.task36.task3608.model.service.UserService;
import com.codegym.task.task36.task3608.model.service.UserServiceImpl;

import java.util.List;

public class MainModel implements Model {

    private DataModel dataModel = new DataModel();
    private UserService userService = new UserServiceImpl();

    @Override
    public DataModel getDataModel() {
        return dataModel;
    }

    @Override
    public void loadUsers() {
        dataModel.setDisplayDeletedUserList(false);
        dataModel.setUsers(userService.getUsersBetweenLevels(1, 100));

    }

    public void loadDeletedUsers() {
        dataModel.setDisplayDeletedUserList(true);


        List<User> users = userService.getAllDeletedUsers();
        dataModel.setUsers(users);
    }

    public void loadUserById(long id) {
        User user = userService.getUsersById(id);
        dataModel.setActiveUser(user);
    }
}

