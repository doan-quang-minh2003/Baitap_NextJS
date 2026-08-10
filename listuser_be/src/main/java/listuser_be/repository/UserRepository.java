/*
 * Copyright(C) 2026 Luvina Software Company
 *
 * UserRepository.java, 11/08/2026 DoanQuangMinh
 */

package listuser_be.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import listuser_be.entity.User;

/**
 * Repository xử lý truy cập dữ liệu User.
 *
 * Kế thừa JpaRepository để cung cấp các thao tác CRUD
 * cơ bản cho entity User.
 *
 * @author DoanQuangMinh
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}

