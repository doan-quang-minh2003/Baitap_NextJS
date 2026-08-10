/*
 * Copyright(C) 2026 Luvina Software Company
 *
 * ListuserBeApplication.java, 11/08/2026 DoanQuangMinh
 */

package listuser_be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Lớp khởi động ứng dụng List User Backend.
 *
 * @author DoanQuangMinh
 */
@SpringBootApplication
public class ListuserBeApplication {

	/**
	 * Điểm bắt đầu của ứng dụng Spring Boot.
	 *
	 * @param args tham số truyền vào khi khởi động ứng dụng
	 */
	public static void main(String[] args) {
		SpringApplication.run(ListuserBeApplication.class, args);
	}
}

