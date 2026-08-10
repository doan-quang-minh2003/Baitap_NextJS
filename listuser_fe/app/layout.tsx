/*
 * Copyright(C) 2026 Luvina Software Company
 *
 * layout.tsx, 11/08/2026 DoanQuangMinh
 */

import type { Metadata } from "next";

import Footer from "@/components/Footer/Footer";
import Header from "@/components/Header/Header";

import "./globals.css";

export const metadata: Metadata = {
  title: "User Management",
  description: "Next.js + Spring Boot Demo",
};

/**
 * Props của Root Layout.
 */
interface RootLayoutProps {
  children: React.ReactNode;
}

/**
 * Layout gốc của hệ thống User Management.
 *
 * Cung cấp cấu trúc chung cho toàn bộ các trang,
 * bao gồm Header, nội dung chính và Footer.
 *
 * @param children Nội dung của trang hiện tại.
 * @author DoanQuangMinh
 */
export default function RootLayout({
  children,
}: RootLayoutProps) {
  return (
    <html lang="en">
      <body>
        <Header />

        <main>{children}</main>

        <Footer />
      </body>
    </html>
  );
}

