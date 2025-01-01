public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
       }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("This price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This notebook is light.");
        } else if (this.weight >= 700 && this.weight <= 2000) {
            System.out.println("This weight is good.");
        } else {
            System.out.println("This notebook is heavy.");
        }
    }

    public void checkParametr(){
        if(this.price > 600 && this.year < 2000){
            System.out.println("This notebook is old but expensive.");
        }
        else if (this.price >= 600 && this.year >= 2023) {
            System.out.println("This laptop is new and cheap");
        }
        else if (this.price > 600 && this.year < 2023) {
            System.out.println("This laptop is ok");
        }
        else {
            System.out.println("Check out this laptop.");
        }
    }

    }

