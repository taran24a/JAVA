// LinkedList Student Project Manager:
// WAP that perform following operations:
// 1 Create  node class:
// int id;
// string name;
// node next;

// Create a class StudentList that contains the following functionalities:
// insert Student Data
// Display All Student Data
// Delete By Id
// Search by name

//Menu driven program to perform:
// Add student
// Delete student
// Search Student
// Display all students
// Do u want to continue(y/n)?
// Exit
import java.util.Scanner;

class Node {
    int id;
    String name;
    Node next;

    public Node(int id, String name) {
        this.id = id;
        this.name = name;
        this.next = null;
    }
}

class StudentList {
    private Node head = null;

    // Insert Student Data
    public void insertStudent(int id, String name) {
        Node newNode = new Node(id, name);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
        System.out.println("Student added successfully!");
    }

    // Display All Students
    public void displayStudents() {
        if (head == null) {
            System.out.println("No students in the list.");
            return;
        }
        System.out.println("Student List");
        Node temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.id + " Name: " + temp.name);
            temp = temp.next;
        }
    }

    // Delete by ID
    public void deleteById(int id) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.id == id) {
            head = head.next;
            System.out.println("Student deleted successfully!");
            return;
        }

        Node temp = head;
        Node prev = null;

        while (temp != null && temp.id != id) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Student not found!");
            return;
        }

        prev.next = temp.next;
        System.out.println("Student deleted successfully!");
    }

    // Search by Name
    public void searchByName(String name) {
        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Student Found: ID: " + temp.id + ", Name: " + temp.name);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No student found with the name: " + name);
    }
}

public class StudentProjectManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList list = new StudentList();
        char choice;

        do {
            System.out.println("\n Student Project Manager Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); 

            switch (ch) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    list.insertStudent(id, name);
                    break;

                case 2:
                    System.out.print("Enter ID to delete: ");
                    int delId = sc.nextInt();
                    list.deleteById(delId);
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    list.searchByName(searchName);
                    break;

                case 4:
                    list.displayStudents();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            System.out.print("\nDo you want to continue (y/n)? ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        sc.close();
        System.out.println("Program terminated. Goodbye!");
    }
}

