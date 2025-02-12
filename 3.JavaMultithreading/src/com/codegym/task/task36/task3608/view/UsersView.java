package com.codegym.task.task36.task3608.view;

import com.codegym.task.task36.task3608.controller.Controller;
import com.codegym.task.task36.task3608.model.DataModel;

public class UsersView implements View {

    private Controller controller;

    public UsersView() {
    }


    @Override
    public void refresh(DataModel dataModel) {
        if (dataModel.isDisplayDeletedUserList())

            System.out.println("All deleted users:");
        else
            System.out.println("All users:");
        dataModel.getUsers().forEach(a -> {
            System.out.println("\t" + a);
        });
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }





    public void fireShowAllUsersEvent() {
        controller.onShowAllUsers();
    }

    public void fireShowDeletedUsersEvent() {
        controller.onShowAllDeletedUsers();
    }

    public void fireOpenUserEditFormEvent(long userId) {
        controller.onOpenUserEditForm(userId);
    }


}
