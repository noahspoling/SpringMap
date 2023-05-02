package com.noahspoling.Atlas.Service;

import com.noahspoling.Atlas.Model.User;

import java.util.List;

import com.noahspoling.Atlas.DAO.UserDAO;

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
    public User getUser(long id){
        return null;
    }
    public List<User> getAllUsers(){
        return null;
    }
}
