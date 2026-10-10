import java.util.*;

class Book {
    int id;
    String name, author;
    boolean issued;

    Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
        issued = false;
    }

    void display() {
        System.out.println(id + "  " + name + "  " + author +
                "  " + (issued ? "Issued" : "Available"));
    }
}

public class LibraryManagementSystem {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== LIBRARY MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Calculate Fine");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Book Name: ");
                    String name = sc.nextLine();

                    System.out.print("Author: ");
                    String author = sc.nextLine();

                    books.add(new Book(id, name, author));
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    System.out.println("\nID  Book Name  Author  Status");
                    for (Book b : books)
                        b.display();
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    int search = sc.nextInt();
                    boolean found = false;

                    for (Book b : books) {
                        if (b.id == search) {
                            b.display();
                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("Book not found.");
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    int issue = sc.nextInt();
                    found = false;

                    for (Book b : books) {
                        if (b.id == issue) {
                            found = true;

                            if (!b.issued) {
                                b.issued = true;
                                System.out.println("Book issued successfully.");
                            } else {
                                System.out.println("Book already issued.");
                            }
                        }
                    }

                    if (!found)
                        System.out.println("Book not found.");
                    break;

                case 5:
                    System.out.print("Enter Book ID: ");
                    int ret = sc.nextInt();
                    found = false;

                    for (Book b : books) {
                        if (b.id == ret) {
                            found = true;

                            if (b.issued) {
                                b.issued = false;
                                System.out.println("Book returned successfully.");
                            } else {
                                System.out.println("Book was not issued.");
                            }
                        }
                    }

                    if (!found)
                        System.out.println("Book not found.");
                    break;

                case 6:
                    System.out.print("Enter overdue days: ");
                    int days = sc.nextInt();
                    System.out.println("Fine = ₹" + (days * 5));
                    break;

                case 7:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}