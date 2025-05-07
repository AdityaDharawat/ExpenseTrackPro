package com.expensetracker.service;

import com.expensetracker.model.User;
import com.expensetracker.dto.UserDto;
import com.expensetracker.exception.UserAlreadyExistsException;

import java.util.List;

public interface UserService {
    User registerNewUser(UserDto userDto) throws UserAlreadyExistsException;
    User getUserByUsername(String username);
    User getUserById(Long id);
    List<User> getAllUsers();
    User updateUser(User user);
    User updateUserRole(Long userId, String role);
    void deleteUser(Long userId);
    boolean checkIfValidOldPassword(User user, String oldPassword);
    void changeUserPassword(User user, String newPassword);
}