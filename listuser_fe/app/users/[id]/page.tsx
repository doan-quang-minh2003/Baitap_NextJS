import Link from "next/link";
import { getUserById } from "@/services/userService";

interface UserDetailPageProps {
    params: Promise<{
        id: string;
    }>;
}

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

            <Link href="/users">
                ← Back to User List
            </Link>
        </main>
    );
}

