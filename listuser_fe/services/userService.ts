/*
 * Copyright(C) 2026 Luvina Software Company
 *
 * userService.ts, 11/08/2026 DoanQuangMinh
 */

import { User } from "@/types/user";

const API_URL = "http://localhost:8080/api/users";

/**
 * Lấy danh sách tất cả người dùng từ User API.
 *
 * @return Promise chứa danh sách người dùng.
 * @throws Error khi API trả về response không thành công.
 * @author DoanQuangMinh
 */
export async function getUsers(): Promise<User[]> {
  const response = await fetch(API_URL, {
    cache: "no-store",
  });

  if (!response.ok) {
    throw new Error("Failed to fetch users.");
  }

  return response.json();
}

/**
 * Lấy thông tin chi tiết của người dùng theo ID.
 *
 * @param id ID của người dùng cần lấy thông tin.
 * @return Promise chứa thông tin người dùng.
 * @throws Error khi API trả về response không thành công.
 * @author DoanQuangMinh
 */
export async function getUserById(id: string): Promise<User> {
  const response = await fetch(`${API_URL}/${id}`, {
    cache: "no-store",
  });

  if (!response.ok) {
    throw new Error("Failed to fetch user.");
  }

  return response.json();
}

