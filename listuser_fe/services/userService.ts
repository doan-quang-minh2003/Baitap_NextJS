import { User } from "@/types/user";

const API_URL = "http://localhost:8080/api/users";

export async function getUsers(): Promise<User[]> {
  const response = await fetch(API_URL, {
    cache: "no-store",
  });

  if (!response.ok) {
    throw new Error("Failed to fetch users.");
  }

  return response.json();
}

export async function getUserById(id: string): Promise<User> {
  const response = await fetch(`${API_URL}/${id}`, {
    cache: "no-store",
  });

  if (!response.ok) {
    throw new Error("Failed to fetch user");
  }

  return response.json();
}


