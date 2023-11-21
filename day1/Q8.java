import java.util.Scanner;

class Q8 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Value");
        int n = scn.nextInt();
        if( (n & 1) == 1){
            System.out.println(n + " is odd");
        }else{
            System.out.println(n + " is even");
        }
        scn.close();
    }
}
