/*
 * Copyright(C) 2026 Luvina Software Company
 *
 * UserService.java, 11/08/2026 DoanQuangMinh
 */

package listuser_be.service;

import java.util.List;

import listuser_be.entity.User;

/**
 * Interface định nghĩa các nghiệp vụ xử lý User.
 *
 * @author DoanQuangMinh
 */
public interface UserService {

    /**
     * Lấy danh sách tất cả User.
     *
     * @return danh sách User
     */
    List<User> getAllUsers();

    /**
     * Lấy User theo ID.
     *
     * @param id mã User cần tìm
     * @return User tương ứng với ID
     */
    User getUserById(Integer id);
}

