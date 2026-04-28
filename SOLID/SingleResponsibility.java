//Here Each class have only one responsibility. User class is responsible for holding user data, UserService class is responsible for saving user data and EmailService class is responsible for sending email. This way we can easily maintain and modify each class without affecting the others.

package SOLID;

class User {
    String name;
    String email;
}

class UserService {
    void save(User u) {
        System.out.println("Saving user");
    }
}

class EmailService {
    void sendEmail(User u) {
        System.out.println("Sending email to " + u.email);
    }
}
public class SingleResponsibility {
    public static void main(String[] args) {
        User u = new User();
        u.name = "John Doe";
        u.email = "john@gmail.com";
        UserService us = new UserService();
        us.save(u);
        EmailService es = new EmailService();
        es.sendEmail(u);
    }
}