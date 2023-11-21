import java.util.Scanner;

class Q2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Year: ");
        String n = scn.nextLine();
        if(n.length() != 4){
            System.out.println("Year should be of four length");
        }else if(Integer.parseInt(n)%4==0){
            System.out.println(n + " is a leap year");
        }else
            System.out.println(n + " is not a leap year");
        scn.close();
    }
}
