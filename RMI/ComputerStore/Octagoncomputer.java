package ComputerStore;
import java.util.*;

public class Octagoncomputer {

    static int subtotal = 0;

    public static void main(String[] args) {

        Scanner  ian = new Scanner(System.in);
        char choice, ish;

        int i = 0, cash, change;

        do {
            System.out.print("Enter your name: ");
            String name = ian.nextLine();
            System.out.println("Hi " + name + " WELCOME IN OCTAGON COMPUTER STORE!");
            System.out.println("...........................");
            System.out.println("MENU");
            System.out.println("\nA.CPU\nB.KEYBOARD\nC.DESKTOP\nD.LAPTOP\nE.PRINTER");
            System.out.print("Enter your choice:");
            char ir = ian.next().charAt(0);
            switch (ir) {
                case 'A':
                case 'a':
                    cpu();
                    break;

                case 'B':
                case 'b':
                    keyboard();
                    break;
                case 'C':
                case 'c':
                    desktop();
                    break;
                case 'D':
                case 'd':
                    laptop();
                    break;
                case 'E':
                case 'e':
                    printer();
                    break;
                default:
                    System.out.print("Invalid Input!\nPlease Try Again!");

            }

            System.out.print("Do you want to order from the main menu (y/n):");
            ish = ian.next().charAt(0);
            boolean na;

        } while (ish == 'Y' || ish == 'y');

        do {
            System.out.println("\nTotal Bill: " + subtotal);
            System.out.print("\nEnter Cash Rendered: ");
            cash = ian.nextInt();
            change = cash - subtotal;
            do {
                System.out.print("insufficient cash\nPlease Try Again!");
                System.out.print("\nEnter Cash Rendered: ");
                cash = ian.nextInt();
                change = cash - subtotal;
            } while (subtotal > cash);

        } while (cash < subtotal);
        System.out.print("change: " + change);
    }

    public static void desktop() {
        Scanner ian = new Scanner(System.in);
        char ish;
        int[] price = {11500, 20000, 11000, 12000, 10000};
        do {
            System.out.println(".......................... ");
            System.out.print("\n\nYou've Chosen Desktop ");
            System.out.print("\nMenu: \n");
            System.out.println("\tA.Lenovo ThinkCentre M73 4th Gen i5 Desktop Computer Set Package With Monitor Wifi\t\t:" + price[0]);
            System.out.println("\tB.Desktop with Printer neutron phantom and acer                                   \t\t:" + price[1]);
            System.out.println("\tC.Dell Optilex i5 windows 10 office 8gb ram 350gb interna                         \t\t:" + price[2]);
            System.out.println("\tD.AMD A8 7600 with acer 15.6 HD Led Monitor AMD                                   \t\t:" + price[3]);
            System.out.println("\tE.Intel Pentium Desktop with 19.5 Monitor 4gb Ram and 500gb Storage               \t\t:" + price[4]);
            System.out.print("\tEnter your choice:");
            char ir = ian.next().charAt(0);
            switch (ir) {
                case 'A':
                case 'a':
                    System.out.print("\tYou've chosen:\n Lenovo ThinkCentre M73 4th Gen i5 Desktop Computer Set Package With Monitor Wifi\t\t:" + price[0]);
                    System.out.print("\n\tQuantity: ");
                    int quant = ian.nextInt();
                    subtotal += (quant * price[0]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;

                case 'B':
                case 'b':
                    System.out.println("\tB.You've Chosen:\n Desktop with Printer neutron phantom and acer\t\t:" + price[1]);
                    System.out.print("\n\tQuantity: ");
                    int q = ian.nextInt();
                    subtotal += (q * price[1]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;

                case 'C':
                case 'c':
                    System.out.println("\tC.You've Chosen:\n Dell Optilex i5 windows 10 office 8gb ram 350gb interna\t\t:" + price[2]);
                    System.out.print("\n\tQuantity: ");
                    int o = ian.nextInt();
                    subtotal += (o * price[2]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;

                case 'D':
                case 'd':
                    System.out.println("\tD.You've Chosen:\n AMD A8 7600 with acer 15.6 HD Led Monitor AMD\t\t:12,000 " + price[3]);
                    System.out.print("\n\tQuantity: ");
                    int a = ian.nextInt();
                    subtotal += (a * price[3]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;

                case 'E':
                case 'e':
                    System.out.println("\tE.You've Chosen:\n Intel Pentium Desktop with 19.5 Monitor 4gb Ram and 500gb Storage\t\t" + price[4]);
                    System.out.print("\n\tQuantity: ");
                    int n = ian.nextInt();
                    subtotal += (n * price[4]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;

                default:
                    System.out.print("Invalid Input!\nPlease Try Again!");

            }

            System.out.print("\nDo you want to order from the desktop menu (y/n): ");
            ish = ian.next().charAt(0);

        } while (ish == 'Y' || ish == 'y');

    }

    public static void laptop() {
        Scanner ian = new Scanner(System.in);
        char nas;
        int[] price = {24000, 16000, 17000, 40000, 6000};
        do {
            System.out.println(".......................... ");
            System.out.print("\n\nYou've Chosen Laptop ");
            System.out.print("\nMenu: \n");
            System.out.println("\tA.15.6 inch 6th Gen i7 GTX-960M Gpu 16gb ram 512gb ssd gaming laptop                       \t\t:" + price[0]);
            System.out.println("\tB.15.6 inch laptop Notebook Core l5 i7 500gb laptop computer with Win 10 OS laptop computer\t\t:" + price[1]);
            System.out.println("\tC.14 inch metal laptop 2020 new ultra-thin portable business office netbook 8gb SSD netbook\t\t:" + price[2]);
            System.out.println("\tD.Huawei Matebook D15 BUNDLE-Space Gray Huawei                                             \t\t:" + price[3]);
            System.out.println("\tE.Android Laptop Quad Core                                                                 \t\t:" + price[4]);
            System.out.print("\tEnter your choice:");
            char as = ian.next().charAt(0);
            switch (as) {
                case 'A':
                case 'a':
                    System.out.print("\tYou've chosen:\n 15.6 inch 6th Gen i7 GTX-960M Gpu 16gb ram 512gb ssd gaming laptop \t\t: " + price[0]);
                    System.out.print("\n\tQuantity: ");
                    int quant = ian.nextInt();
                    subtotal += (quant * price[0]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;

                case 'B':
                case 'b':
                    System.out.println("\tB.You've Chosen:\n 15.6 inch laptop Notebook Core l5 i7 500gb laptop computer with Win 10 OS laptop computer\t\t:" + price[1]);
                    System.out.print("\n\tQuantity: ");
                    int k = ian.nextInt();
                    subtotal += (k * price[1]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;

                case 'C':
                case 'c':
                    System.out.println("\tC.You've Chosen:\n 14 inch metal laptop 2020 new ultra-thin portable business office netbook 8gb SSD netbook\t\t:" + price[2]);
                    System.out.print("\n\tQuantity: ");
                    int o = ian.nextInt();
                    subtotal += (o * price[2]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;

                case 'D':
                case 'd':
                    System.out.println("\tD.You've Chosen:\n Huawei Matebook D15 BUNDLE-Space Gray Huawei\t\t:" + price[3]);
                    System.out.print("\n\tQuantity: ");
                    int a = ian.nextInt();
                    subtotal += (a * price[3]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;

                case 'E':
                case 'e':
                    System.out.println("\tE.You've Chosen:\n Android Laptop Quad Core\t\t:" + price[4]);
                    System.out.print("\n\tQuantity: ");
                    int n = ian.nextInt();
                    subtotal += (n * price[4]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;
                default:
                    System.out.print("Invalid Input!\nPlease Try Again!");

            }

            System.out.print("\nDo you want to order from the laptop menu (y/n): ");
            nas = ian.next().charAt(0);
        } while (nas == 'Y' || nas == 'y');
    }

    public static void printer() {

        Scanner ian = new Scanner(System.in);
        char nas;
        int[] price = {5000, 8000, 10000, 30000, 25000};
        do {
            System.out.println(".......................... ");
            System.out.print("\n\nYou've Chosen Printer ");
            System.out.print("\nMenu: \n");
            System.out.println("\tA.Epson L120 Ink Tank Printer                     \t\t:" + price[0]);
            System.out.println("\tB.Epson L220                                      \t\t:" + price[1]);
            System.out.println("\tC.Printer neutron phantom and acer                \t\t:" + price[2]);
            System.out.println("\tD.Brother DCP L2540 Multi-function Mono laser     \t\t:" + price[3]);
            System.out.println("\tE.HP Deskjet Ink Advantage 3775                   \t\t:" + price[4]);
            System.out.print("\tEnter your choice:");
            char me = ian.next().charAt(0);

            switch (me) {
                case 'A':
                case 'a':
                    System.out.print("\tYou've chosen:\n Epson L120 Ink Tank Printer \t\t: " + price[0]);
                    System.out.print("\n\tQuantity: ");
                    int quant = ian.nextInt();
                    subtotal += (quant * price[0]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;

                case 'B':
                case 'b':
                    System.out.println("\tB.You've chosen:\n Epson L220\t\t:" + price[1]);
                    System.out.print("\n\tQuantity: ");
                    int k = ian.nextInt();
                    subtotal += (k * price[1]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;

                case 'C':
                case 'c':
                    System.out.println("\tC.You've chosen:\n Printer neutron phantom and acer\t\t:" + price[2]);
                    System.out.print("\n\tQuantity: ");
                    int o = ian.nextInt();
                    subtotal += (o * price[2]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;

                case 'D':
                case 'd':
                    System.out.println("\tD.You've chosen:\n Brother DCP L2540 Multi-function Mono laser\t\t:" + price[3]);
                    System.out.print("\n\tQuantity: ");
                    int a = ian.nextInt();
                    subtotal += (a * price[3]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;

                case 'E':
                case 'e':
                    System.out.println("\tE.You've chosen:\n HP Deskjet Ink Advantage 3775\t\t:" + price[4]);
                    System.out.print("\n\tQuantity: ");
                    int n = ian.nextInt();
                    subtotal += (n * price[4]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;
                default:
                    System.out.print("Invalid Input!\nPlease Try Again!");

            }
            System.out.print("\nDo you want to order from the printer menu (y/n): ");
            nas = ian.next().charAt(0);

        } while (nas == 'Y' || nas == 'y');

    }

    public static void keyboard() {
        Scanner ian = new Scanner(System.in);
        char nas;
        int[] price = {2000, 5000, 10000, 20000, 35000};
        do {
            System.out.println(".......................... ");
            System.out.print("\n\nYou've Chosen Keyboard ");
            System.out.print("\nMenu: \n");
            System.out.println("\tA.A4tech Natural Keyboard Round Edge Keycaps Office PC                               \t\t:" + price[0]);
            System.out.println("\tB.MG 87 Key Gaming Keyboard Mechanical Backlight Waterproof Ergonomic Dourable Keypad\t\t:" + price[1]);
            System.out.println("\tC.Universal Thin Round Keycap Chocolate Style USB Wired Keyboard                     \t\t:" + price[2]);
            System.out.println("\tD.Terabyte Wireless Mini Keyboard and Mouse                                          \t\t:" + price[3]);
            System.out.println("\tE.GIGAWARE GX50 Mad Warrior Suspended Key-press Gaming Keyboard                      \t\t:" + price[4]);
            System.out.print("\tEnter your choice:");
            char you = ian.next().charAt(0);

            switch (you) {
                case 'A':
                case 'a':
                    System.out.print("\tYou've chosen:\n A4tech Natural Keyboard Round Edge Keycaps Office PC  \t\t: " + price[0]);
                    System.out.print("\n\tQuantity: ");
                    int quant = ian.nextInt();
                    subtotal += (quant * price[0]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;

                case 'B':
                case 'b':
                    System.out.println("\tB.You've chosen:\n MG 87 Key Gaming Keyboard Mechanical Backlight Waterproof Ergonomic Dourable Keypad\t\t:" + price[1]);
                    System.out.print("\n\tQuantity: ");
                    int k = ian.nextInt();
                    subtotal += (k * price[1]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;

                case 'C':
                case 'c':
                    System.out.println("\tC.You've chosen:\n Universal Thin Round Keycap Chocolate Style USB Wired Keyboard\t\t:" + price[2]);
                    System.out.print("\n\tQuantity: ");
                    int o = ian.nextInt();
                    subtotal += (o * price[2]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;

                case 'D':
                case 'd':
                    System.out.println("\tD.You've chosen:\n Terabyte Wireless Mini Keyboard and Mouse \t\t:" + price[3]);
                    System.out.print("\n\tQuantity: ");
                    int a = ian.nextInt();
                    subtotal += (a * price[3]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;

                case 'E':
                case 'e':
                    System.out.println("\tE.You've chosen:\n GIGAWARE GX50 Mad Warrior Suspended Key-press Gaming Keyboard \t\t:" + price[4]);
                    System.out.print("\n\tQuantity: ");
                    int n = ian.nextInt();
                    subtotal += (n * price[4]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;
                default:
                    System.out.println("Invalid Input!");
                    System.out.println("Please Try Again!\n");

            }
            System.out.println("Do you want to order from the keyboard menu (y/n): ");
            nas = ian.next().charAt(0);

        } while (nas == 'Y' || nas == 'y');

    }

    public static void cpu() {
        Scanner ian = new Scanner(System.in);
        char nas;
        int[] price = {10000, 20000, 30000, 50000, 80000};
        do {
            System.out.println(".......................... ");
            System.out.print("\n\nYou've Chosen CPU ");
            System.out.print("\nMenu: \n");
            System.out.println("\tA.Intel i5 4590t gaming desktop Custom                    \t\t:" + price[0]);
            System.out.println("\tB.Pentium G-3250 CPU set                                  \t\t:" + price[1]);
            System.out.println("\tC.Ipason newest i3 10100 quad-core 8G DDR4 RAM 120G       \t\t:" + price[2]);
            System.out.println("\tD.Acer Veriton Cm-c-ves2735g Intel Celeron G4930/4GB/256Gb\t\t:" + price[3]);
            System.out.println("\tE.Core i3-4150 4TH Gen CPU                                \t\t:" + price[4]);
            System.out.print("\tEnter your choice:");
            char youandme = ian.next().charAt(0);
            switch (youandme) {
                case 'A':
                case 'a':
                    System.out.print("\tYou've chosen:\n Intel i5 4590t gaming desktop Custom    \t\t: " + price[0]);
                    System.out.print("\n\tQuantity: ");
                    int quant = ian.nextInt();
                    subtotal += (quant * price[0]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;

                case 'B':
                case 'b':
                    System.out.println("\tB.You've chosen:\n Pentium G-3250 CPU set\t\t:" + price[1]);
                    System.out.print("\n\tQuantity: ");
                    int k = ian.nextInt();
                    subtotal += (k * price[1]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;

                case 'C':
                case 'c':
                    System.out.println("\tC.You've chosen:\n Ipason newest i3 10100 quad-core 8G DDR4 RAM 120G\t\t:" + price[2]);
                    System.out.print("\n\tQuantity: ");
                    int o = ian.nextInt();
                    subtotal += (o * price[2]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;

                case 'D':
                case 'd':
                    System.out.println("\tD.You've chosen:\n Acer Veriton Cm-c-ves2735g Intel Celeron G4930/4GB/256Gb \t\t:" + price[3]);
                    System.out.print("\n\tQuantity: ");
                    int a = ian.nextInt();
                    subtotal += (a * price[3]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;

                case 'E':
                case 'e':
                    System.out.println("\tE.You've chosen:\n Core i3-4150 4TH Gen CPU  \t\t:" + price[4]);
                    System.out.print("\n\tQuantity: ");
                    int n = ian.nextInt();
                    subtotal += (n * price[4]);
                    System.out.print("\n\tSubtotal: " + subtotal);
                    break;
                default:
                    System.out.print("Invalid Input!\nPlease Try Again!");

            }
            System.out.print("\nDo you want to order from the cpu menu (y/n): ");
            nas = ian.next().charAt(0);

        } while (nas == 'Y' || nas == 'y');

    }

}  