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

    }
}
