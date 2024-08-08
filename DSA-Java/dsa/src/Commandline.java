import java.util.Scanner;

public class Commandline {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        System.out.println("How many values do you wish to compare:");
        n = input.nextInt();
        int values[] = new int[n];

        for(int i = 0 ; i<=n; i++){
            System.out.println("Enter Value " + i);
            values[i] = input.nextInt();
        }

        int greatest_ofAll (int[] val){

            int p = 0;
            for(int i=0; i<=n; i++){
                if(p < val[i]){
                    p = val[i];
                }
            }
        };

        System.out.println("Largest Number = " + greatest_ofAll(values[]));
    }
}
