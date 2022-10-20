package ru.adrenoxxxrom.security.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.adrenoxxxrom.security.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    void saveUser(User user);
    void removeUserById(Long id);
    List<User> getAllUsers();
    void updateUser(Long id, User user);
    User getUserById(Long id);
    User getUserByName(String name);
}

