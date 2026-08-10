/*
 * Copyright(C) 2026 Luvina Software Company
 *
 * page.tsx, 11/08/2026 DoanQuangMinh
 */

import Link from "next/link";

import { getUsers } from "@/services/userService";
import { User } from "@/types/user";

import styles from "./Users.module.css";

/**
 * Hiển thị danh sách người dùng trong hệ thống.
 *
 * Lấy danh sách người dùng từ User Service và hiển thị
 * thông tin người dùng dưới dạng bảng.
 *
 * @author DoanQuangMinh
 */
export default async function UsersPage() {
  const users: User[] = await getUsers();

  return (
    <main>
      <section>
        <h1 className={styles.title}>User List</h1>

        <table className={styles.table}>
          <thead>
            <tr>
              <th>Name</th>
              <th>Birthday</th>
              <th>Department</th>
              <th>Email</th>
              <th>Phone</th>
              <th>Major</th>
              <th>Date</th>
              <th>Score</th>
            </tr>
          </thead>

          <tbody>
            {users.map((user) => (
              <tr key={user.id}>
                <td>
                  <Link href={`/users/${user.id}`}>{user.name}</Link>
                </td>

                <td>{user.birthday}</td>

                <td>{user.department}</td>

                <td>{user.email}</td>

                <td>{user.phone}</td>

                <td>{user.major}</td>

                <td>{user.date}</td>

                <td>{user.score}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </section>
    </main>
  );
}

