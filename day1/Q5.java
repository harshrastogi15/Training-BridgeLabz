import java.util.Scanner;

class Q5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Value");
        int n = scn.nextInt();

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
            while(n%i==0){
                n /= i;
            }
        }
        if(n>2){
            System.out.print(n + " ");
        }

        scn.close();
    }
}
