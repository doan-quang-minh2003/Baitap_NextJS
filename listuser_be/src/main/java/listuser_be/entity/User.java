/*
 * Copyright(C) 2026 Luvina Software Company
 *
 * User.java, 11/08/2026 DoanQuangMinh
 */

package listuser_be.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entity đại diện cho thông tin User trong hệ thống.
 *
 * Ánh xạ đối tượng User với bảng users trong cơ sở dữ liệu.
 *
 * @author DoanQuangMinh
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    private LocalDate birthday;

    private String department;

    private String email;

    private String phone;

    private String major;

    private LocalDate date;

    private Double score;

    /**
     * Khởi tạo User mặc định.
     */
    public User() {
    }

    /**
     * Khởi tạo User với đầy đủ thông tin.
     *
     * @param id mã User
     * @param name tên User
     * @param birthday ngày sinh
     * @param department phòng ban
     * @param email địa chỉ email
     * @param phone số điện thoại
     * @param major chuyên ngành
     * @param date ngày thông tin được ghi nhận
     * @param score điểm của User
     */
    public User(
            Integer id,
            String name,
            LocalDate birthday,
            String department,
            String email,
            String phone,
            String major,
            LocalDate date,
            Double score) {

        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.department = department;
        this.email = email;
        this.phone = phone;
        this.major = major;
        this.date = date;
        this.score = score;
    }

    /**
     * Lấy mã User.
     *
     * @return mã User
     */
    public Integer getId() {
        return id;
    }

    /**
     * Cập nhật mã User.
     *
     * @param id mã User mới
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Lấy tên User.
     *
     * @return tên User
     */
    public String getName() {
        return name;
    }

    /**
     * Cập nhật tên User.
     *
     * @param name tên User mới
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Lấy ngày sinh của User.
     *
     * @return ngày sinh
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * Cập nhật ngày sinh của User.
     *
     * @param birthday ngày sinh mới
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    /**
     * Lấy phòng ban của User.
     *
     * @return phòng ban
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Cập nhật phòng ban của User.
     *
     * @param department phòng ban mới
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Lấy địa chỉ email của User.
     *
     * @return địa chỉ email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Cập nhật địa chỉ email của User.
     *
     * @param email địa chỉ email mới
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Lấy số điện thoại của User.
     *
     * @return số điện thoại
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Cập nhật số điện thoại của User.
     *
     * @param phone số điện thoại mới
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Lấy chuyên ngành của User.
     *
     * @return chuyên ngành
     */
    public String getMajor() {
        return major;
    }

    /**
     * Cập nhật chuyên ngành của User.
     *
     * @param major chuyên ngành mới
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * Lấy ngày của User.
     *
     * @return ngày
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Cập nhật ngày của User.
     *
     * @param date ngày mới
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Lấy điểm của User.
     *
     * @return điểm User
     */
    public Double getScore() {
        return score;
    }

    /**
     * Cập nhật điểm của User.
     *
     * @param score điểm mới
     */
    public void setScore(Double score) {
        this.score = score;
    }
}

