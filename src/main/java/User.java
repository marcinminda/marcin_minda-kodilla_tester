//Prezentacja w FirstClass
public class User {
    int age;
    String name;

    public User (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    static double averageUser (User[] users){
        int sumAge = 0;
        for(User user : users) {
            sumAge += user.getAge();
        }
        return (double)sumAge/users.length;
    }

}
