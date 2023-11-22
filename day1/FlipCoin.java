import java.util.Scanner;

class FlipCoin{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of times to Flip Coin:");
        int n = scn.nextInt();

        int head = 0,tail = 0;

        for(int i=0;i<n;i++){
            double rdm = Math.random();
            if(rdm < 0.5) {
                tail++;
            }else{
                head++;
            }
        }
        double percentageOfHead = (double) head * 100/ (double) n;
        double percentageOfTail = (double) tail * 100/ (double) n;

        System.out.println("Percentage of Head: " + percentageOfHead + "\nPercentage of Tail: " + percentageOfTail);
        scn.close();
    }
}
