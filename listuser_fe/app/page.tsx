/*
 * Copyright(C) 2026 Luvina Software Company
 *
 * page.tsx, 11/08/2026 DoanQuangMinh
 */

import Link from "next/link";

/**
 * Hiển thị trang chủ của hệ thống quản lý người dùng.
 *
 * Cung cấp thông tin giới thiệu hệ thống và đường dẫn
 * tới trang danh sách người dùng.
 *
 * @author DoanQuangMinh
 */
export default function HomePage() {
  return (
    <main>
      <section>
        <h1>Home Page</h1>

        <p>Welcome to User Management System.</p>

        <Link href="/users">Go to User List</Link>
      </section>
    </main>
  );
}

