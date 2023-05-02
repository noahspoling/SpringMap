package com.noahspoling.Atlas;

import java.util.List;

import com.noahspoling.Atlas.DAO.UserDAO;
import com.noahspoling.Atlas.Model.User;

public class UserService {
    UserDAO userDAO;
    private int delete_service_response;

    public UserService(){
        this.userDAO = new UserDAO();
    }
    public UserService(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    public User addUser(User user){
        return null;
    }

    public User logout(User user){
        return null;
    }
    public User login(User user){
        return null;
    }
    public User getUser(){
        return null;
    }

    public List<User> getAllUsers(){
        return null;
    }
}
