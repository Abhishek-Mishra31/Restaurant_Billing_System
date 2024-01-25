import java.util.InputMismatchException;
import java.util.Scanner;

class order1 {
    int price = 200;

    public int get_price() {
        return price;
    }
}

class order2 {
    int price = 300;

    public int get_price() {
        return price;
    }
}

class order3 {
    int price = 150;

    public int get_price() {
        return price;
    }
}

class order4 {
    int price = 200;

    public int get_price() {
        return price;
    }
}

class order5 {
    int price = 300;

    public int get_price() {
        return price;
    }
}

class order6 {
    int price = 250;

    public int get_price() {
        return price;
    }
}

public class Restaurant_Billing_system {
    public static void main(String[] args) throws InputMismatchException {
        order1 a = new order1();
        order2 b = new order2();
        order3 c = new order3();
        order4 d = new order4();
        order5 e = new order5();
        order6 f = new order6();
        int order, deals;

        System.out.println("*******************************************************************************");
        System.out.println("*********** MENU ***********");

        System.out.println("(1)" + "  BUTTER CHICKEN :- " + " Rs 200 Only");
        System.out.println("(2)" + "  PANEER BUTTER MASALA :-" + " Rs 300 Only");
        System.out.println("(3)" + "  PALAK PANEER :-" + " Rs 150 Only");
        System.out.println("(4)" + "  MANCHURIAN :-" + " Rs 200 Only");
        System.out.println("(5)" + "  FRIED RICE :-" + " Rs 300 Only");
        System.out.println("(6)" + "  CHILLI PANEER :-" + " Rs 250 Only");
        System.out.println("\n");

        System.out.println("Enter Order : ");
        Scanner sc = new Scanner(System.in);
        order = sc.nextInt();
        System.out.println("Enter deals : ");
        Scanner sc1 = new Scanner(System.in);
        deals = sc1.nextInt();
        sc.close();
        sc1.close();

        switch (order) {
            case 1:
                System.out.println("You Ordered BUTTER CHICKEN ");
                System.out.println("Your Deals is " + deals + " Plates ");
                System.out.println("you Have To Pay " + a.price * deals + "");
                System.out.println("\n");
                System.out.println("******************THANKS FOR COMING********************");
                System.out.println("******************GOOD DAY*****************************");
                break;

            case 2:
                System.out.println("You Ordered PANEER BUTTER MASALA ");
                System.out.println("Your Deals is " + deals + " Plates ");
                System.out.println("you Have To Pay " + b.price * deals);
                System.out.println("\n");
                System.out.println("******************THANKS FOR COMING********************");
                System.out.println("******************GOOD DAY*****************************");
                break;

            case 3:
                System.out.println("You Ordered PALAK PANEER ");
                System.out.println("Your Deals is " + deals + " Plates ");
                System.out.println("you Have To Pay " + c.price * deals);
                System.out.println("\n");
                System.out.println("******************THANKS FOR COMING********************");
                System.out.println("******************GOOD DAY*****************************");
                break;

            case 4:
                System.out.println("You Ordered MANCHURIAN ");
                System.out.println("Your Deals is " + deals + " Plates ");
                System.out.println("you Have To Pay " + d.price * deals);
                System.out.println("\n");
                System.out.println("******************THANKS FOR COMING********************");
                System.out.println("******************GOOD DAY*****************************");
                break;

            case 5:
                System.out.println("You Ordered FRIED RICE ");
                System.out.println("Your Deals is " + deals + " Plates ");
                System.out.println("you Have To Pay " + e.price * deals);
                System.out.println("\n");
                System.out.println("******************THANKS FOR COMING********************");
                System.out.println("******************GOOD DAY*****************************");
                break;

            case 6:
                System.out.println("You Ordered CHILLI PANEER ");
                System.out.println("Your Deals is " + deals + " Plates ");
                System.out.println("you Have To Pay " + f.price * deals);
                System.out.println("\n");
                System.out.println("******************THANKS FOR COMING********************");
                System.out.println("******************GOOD DAY*****************************");
                break;

            default:
                System.out.println("choose order carefully");

        }

    }

}