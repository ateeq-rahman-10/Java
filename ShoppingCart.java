import java.util.Scanner;

class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int n1 = 0, n2 = 0, n3 = 0;
        int sum_1 = 0, sum_2 = 0, sum_3 = 0;
        int quantity1, quantity2, quantity3;
        int book_price = 500, ts_price = 700, s_price = 1000;

        System.out.println("1. Books (Per item price = 500) ");
        System.out.println("2. T-Shirts (Per item price = 700) ");
        System.out.println("3. Shoes (Per item price = 1000) ");
        System.out.println("0. Exit the Program\n");

        int no;
        System.out.print("Enter a Number to Select any Product to buy or 0 to Exit: ");
        no = scanner.nextInt();
        System.out.println();

        while (no > 0) {
            if (no == 1) {
                System.out.println("You have selected Books.  ");
                System.out.print(" Enter any Quantity : ");
                quantity1 = scanner.nextInt();
                System.out.println();
                sum_1 += quantity1;
            } else if (no == 2) {
                System.out.println("You have selected T-Shirts.  ");
                System.out.print(" Enter any Quantity : ");
                quantity2 = scanner.nextInt();
                System.out.println();
                sum_2 += quantity2;
            } else if (no == 3) {
                System.out.println("You have selected Shoes. ");
                System.out.print(" Enter any Quantity : ");
                quantity3 = scanner.nextInt();
                System.out.println();
                sum_3 += quantity3;
            } else if (no > 3) {
                System.out.println("Sorry You have selected Invalid Number:\n");
                break;
            }

            System.out.println("1. Books (Per item price = 500) ");
            System.out.println("2. T-Shirts (Per item price = 700) ");
            System.out.println("3. Shoes (Per item price = 1000) ");
            System.out.println("0. Exit the Program\n");

            System.out.print("Enter a Number to Select any Product to buy or 0 to Exit: ");
            no = scanner.nextInt();
            System.out.println();
        }

        if (sum_1 > 0) {
            System.out.println("You have Bought " + sum_1 + " Books which costs : " + sum_1 * book_price + "\n");
        }
        if (sum_2 > 0) {
            System.out.println("You have Bought " + sum_2 + " T-Shirts which costs : " + sum_2 * ts_price + "\n");
        }
        if (sum_3 > 0) {
            System.out.println("You have Bought " + sum_3 + " Shoes which costs : " + sum_3 * s_price + "\n");
        }
        total = sum_1 * book_price + sum_2 * ts_price + sum_3 * s_price;
        System.out.println("Your Total Bill is: " + total);

    }
}
