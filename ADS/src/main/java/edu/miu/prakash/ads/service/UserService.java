package edu.miu.prakash.ads.service;

import edu.miu.prakash.ads.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Integer userId);

    User updateUser(User user);

    void deleteUserById(Integer userId);
}
