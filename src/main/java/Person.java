//Prezentacja w FirstClass
public class Person {
    private String name = "Adam";
    private double age = 40.5;
    private double height = 178;

    public Person (String name, double age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkPerson(){
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }

}
