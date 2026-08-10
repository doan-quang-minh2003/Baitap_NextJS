/*
 * Copyright(C) 2026 Luvina Software Company
 *
 * UserController.java, 11/08/2026 DoanQuangMinh
 */

package listuser_be.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import listuser_be.entity.User;
import listuser_be.service.UserService;

/**
 * Controller xử lý các API liên quan đến User.
 *
 * @author DoanQuangMinh
 */
@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    private final UserService userService;

    /**
     * Khởi tạo UserController với UserService.
     *
     * @param userService service xử lý nghiệp vụ User
     */
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Lấy danh sách tất cả User.
     *
     * @return danh sách User
     */
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    /**
     * Lấy thông tin User theo ID.
     *
     * @param id mã User cần tìm
     * @return User tương ứng với ID
     */
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }
}

