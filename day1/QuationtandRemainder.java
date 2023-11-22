import java.util.Scanner;

class QuationtandRemainder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Dividend");
        int dividend = scn.nextInt();
        System.out.println("Enter Divisor");
        int divisor = scn.nextInt();

        System.out.println("Quationt: "+ dividend/divisor);
        System.out.println("Remainder: "+ dividend%divisor);
        scn.close();
    }
}
