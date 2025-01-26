public class ColorApp {

    public static void main(String[] args) {

        String letter = ColorDialogs.getLetter();


        System.out.println("The first letter of the colour is: " + letter);

        String colorName;


        switch (letter) {
            case "R":
                colorName = "Red";
                break;
            case "G":
                colorName = "Green";
                break;
            case "B":
                colorName = "Blue";
                break;
            case "Y":
                colorName = "Yellow";
                break;
            case "O":
                colorName = "Orange";
                break;
            case "P":
                colorName = "Purple";
                break;
            case "W":
                colorName = "White";
                break;
            case "K":
                colorName = "Black";
                break;
            default:
                colorName = "Unknown color";
                break;
        }


        System.out.println("The color is: " + colorName);
    }
    }



