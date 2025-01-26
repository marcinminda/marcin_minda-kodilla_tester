public class FirstClass {
    public static void main (String[] args){
        Notebook notebook = new Notebook(700, 601, 1999);
        System.out.println("notebook.weight " + notebook.weight + " notebook.price " + notebook.price + " notebook.year " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkParametr();

        Notebook heavyNotebook = new Notebook(2001, 700, 2015);
        System.out.println("\n\nheavyNotebook.weight " + heavyNotebook.weight + " heavyNotebook.price " + heavyNotebook.price + " heavyNotebook " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkParametr();

        Notebook oldNotebook = new Notebook(1600, 1001, 2024);
        System.out.println("\n\noldnotebook.weight " + oldNotebook.weight + " oldnotebook.price " + oldNotebook.price + " oldnotebook " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkParametr();

        Notebook otherNotebook = new Notebook(200, 200, 2024);
        System.out.println("\n\nothernotebook.weight " + otherNotebook.weight + " othernotebook.price " + otherNotebook.price + " othernotebook " + otherNotebook.year);
        otherNotebook.checkPrice();
        otherNotebook.checkWeight();
        otherNotebook.checkParametr();

        Grades grades = new Grades();
      grades.add(1);
//      grades.add(2);
//        grades.add(3);

        System.out.println("Srednia ocen: " +grades.average()+"\nOstatnia ocena: "+grades.lastGrades());

        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User[] users = {anna, betty, carl, david, eva, frankie};
        double averageUser = User.averageUser(users);

        System.out.println("Uzytkownicy z wiekiem poniżej średniej (" + averageUser + "):");
        for (User user : users) {
            if (user.getAge() < averageUser) {
                System.out.println(user.getName());
            }
        }

        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.generateNumbers();

            System.out.println("Maksymalna wartość: " + randomNumbers.getMaxValue());
            System.out.println("Minimalna wartość: " + randomNumbers.getMinValue());

            Person person1 = new Person("Jan",42,180);
            person1.checkPerson();

    }

    }




