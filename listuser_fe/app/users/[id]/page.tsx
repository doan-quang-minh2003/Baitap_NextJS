/*
 * Copyright(C) 2026 Luvina Software Company
 *
 * page.tsx, 11/08/2026 DoanQuangMinh
 */

import Link from "next/link";

import { getUserById } from "@/services/userService";

/**
 * Props của trang hiển thị chi tiết người dùng.
 */
interface UserDetailPageProps {
  params: Promise<{
    id: string;
  }>;
}

/**
 * Hiển thị thông tin chi tiết của một người dùng.
 *
 * Lấy ID người dùng từ URL, sau đó gọi User Service
 * để lấy thông tin chi tiết và hiển thị lên giao diện.
 *
 * @param params Tham số URL chứa ID của người dùng.
 * @author DoanQuangMinh
 */
export default async function UserDetailPage({
  params,
}: UserDetailPageProps) {
  const { id } = await params;
  const user = await getUserById(id);

  return (
    <main>
      <h1>User Detail</h1>

      <div>
        <p>
          <strong>Name:</strong> {user.name}
        </p>

        <p>
          <strong>Birthday:</strong> {user.birthday}
        </p>

        <p>
          <strong>Department:</strong> {user.department}
        </p>

        <p>
          <strong>Email:</strong> {user.email}
        </p>

        <p>
          <strong>Phone:</strong> {user.phone}
        </p>

        <p>
          <strong>Major:</strong> {user.major}
        </p>

        <p>
          <strong>Date:</strong> {user.date}
        </p>

        <p>
          <strong>Score:</strong> {user.score}
        </p>
      </div>

      <Link href="/users">← Back to User List</Link>
    </main>
  );
}

