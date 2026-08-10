/*
 * Copyright(C) 2026 Luvina Software Company
 *
 * Header.tsx, 11/08/2026 DoanQuangMinh
 */

import styles from "./Header.module.css";

/**
 * Hiển thị Header của hệ thống User Management.
 *
 * @author DoanQuangMinh
 */
export default function Header() {
  return (
    <header className={styles.header}>
      <h1 className={styles.title}>User Management System</h1>
    </header>
  );
}

