import Link from "next/link";

export default function HomePage() {
  return (
    <section>
      <h2>Home Page</h2>

      <p>Welcome to User Management System.</p>

      <Link href="/users">Go to User List</Link>
    </section>
  );
}
