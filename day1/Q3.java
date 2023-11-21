import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Value");
        int n = scn.nextInt();
        int pow2 = 1;
        for(int i=0;i<n;i++){
            pow2 = pow2*2;
            System.out.println(pow2);
        }
        scn.close();
    }
}
