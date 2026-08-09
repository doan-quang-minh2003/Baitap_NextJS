package listuser_be.service;

import listuser_be.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Integer id);

}

