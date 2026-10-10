import java.util.*;

class Patient {
    int id, age;
    String name, disease;

    Patient(int id, String name, int age, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    void display() {
        System.out.println(id + "  " + name + "  " + age + "  " + disease);
    }
}

public class HospitalManagementSystem {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Patient> patients = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== HOSPITAL MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Book Appointment");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Patient Name: ");
                    String name = sc.nextLine();

                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Disease: ");
                    String disease = sc.nextLine();

                    patients.add(new Patient(id, name, age, disease));
                    System.out.println("Patient added successfully.");
                    break;

                case 2:
                    System.out.println("\nID  Name  Age  Disease");
                    for (Patient p : patients)
                        p.display();
                    break;

                case 3:
                    System.out.print("Enter Patient ID: ");
                    int search = sc.nextInt();

                    boolean found = false;
                    for (Patient p : patients) {
                        if (p.id == search) {
                            p.display();
                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("Patient not found.");
                    break;

                case 4:
                    System.out.print("Patient Name: ");
                    String patient = sc.nextLine();

                    System.out.print("Doctor Name: ");
                    String doctor = sc.nextLine();

                    System.out.print("Appointment Date: ");
                    String date = sc.nextLine();

                    System.out.println("Appointment booked successfully.");
                    System.out.println(patient + " -> Dr. " + doctor +
                            " on " + date);
                    break;

                case 5:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}