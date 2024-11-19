import java.util.*;
//main class
public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        User newUser = new User();

        // First Name
        while (true) {
            try {
                System.out.println("Please enter the user's first name:");
                String fname = scnr.nextLine();
                newUser.setFirstName(fname);
                break; // Exit loop if no exception
            } catch (IllegalArgumentException e) {
                System.out.println("Error: First name cannot be empty.");
            }
        }

        // Last Name
        while (true) {
            try {
                System.out.println("Please enter the user's last name:");
                String lname = scnr.nextLine();
                newUser.setLastName(lname);
                break; // Exit loop if no exception
            } catch (IllegalArgumentException e) {
                System.out.println("Error: Last name cannot be empty.");
            }
        }

        // Birthday
        while (true) {
            try {
                System.out.println("Please enter the user's birthday in the format mm/dd/yyyy:");
                String bday = scnr.nextLine();
                newUser.setBirthday(bday);
                break; // Exit loop if no exception
            } catch (IllegalArgumentException e) {
                System.out.println("Error: Birthday must be exactly 10 characters in the format mm/dd/yyyy.");
            }
        }

        // Password
        while (true) {
            try {
                System.out.println("Please enter the user's password:");
                String psw = scnr.nextLine();
                newUser.setPassword(psw);
                break; // Exit loop if no exception
            } catch (IllegalArgumentException e) {
                System.out.println("Error: Password must be 7-14 characters long, with at least one uppercase and one lowercase letter.");
            }
        }

        // Zipcode
        while (true) {
            try {
                System.out.println("Please enter the user's zipcode:");
                String zip = scnr.nextLine();
                newUser.setZipcode(zip);
                break; // Exit loop if no exception
            } catch (IllegalArgumentException e) {
                System.out.println("Error: Zipcode must be exactly 5 characters.");
            }
        }

        System.out.println("User successfully created!");

        scnr.close();
    }
}
//user class 
public class User {

    private String firstName;
    private String lastName;
    private String password;
    private String birthday;
    private String zipcode;

    public User() {
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("First name cannot be empty.");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be empty.");
        }
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        if (password == null || password.length() < 7 || password.length() > 14 ||
            !password.matches(".*[A-Z].*") || !password.matches(".*[a-z].*")) {
            throw new IllegalArgumentException("Password must be 7-14 characters long and contain at least one uppercase and one lowercase letter.");
        }
        this.password = password;
    }

    public void setBirthday(String birthday) {
        if (birthday == null || birthday.length() != 10) {
            throw new IllegalArgumentException("Birthday must be exactly 10 characters in the format mm/dd/yyyy.");
        }
        this.birthday = birthday;
    }

    public void setZipcode(String zipcode) {
        if (zipcode == null || zipcode.length() != 5 || !zipcode.matches("\\d+")) {
            throw new IllegalArgumentException("Zipcode must be exactly 5 digits.");
        }
        this.zipcode = zipcode;
    }
}
