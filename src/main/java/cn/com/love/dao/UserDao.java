package cn.com.love.dao;

import cn.com.love.model.User;



public interface UserDao {
    public User getUser(User user);
    public Long addUser(User user);
    public void updateUser(User user);
    public void deleteUser(int UserId);
}