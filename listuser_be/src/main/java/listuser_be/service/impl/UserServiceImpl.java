/*
 * Copyright(C) 2026 Luvina Software Company
 *
 * UserServiceImpl.java, 11/08/2026 DoanQuangMinh
 */

package listuser_be.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import listuser_be.entity.User;
import listuser_be.repository.UserRepository;
import listuser_be.service.UserService;

/**
 * Lớp triển khai các nghiệp vụ xử lý User.
 *
 * @author DoanQuangMinh
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    /**
     * Khởi tạo UserServiceImpl với UserRepository.
     *
     * @param userRepository repository xử lý dữ liệu User
     */
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Lấy danh sách tất cả User.
     *
     * @return danh sách User
     */
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * Lấy User theo ID.
     *
     * @param id mã User cần tìm
     * @return User nếu tìm thấy, ngược lại trả về null
     */
    @Override
    public User getUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }
}

