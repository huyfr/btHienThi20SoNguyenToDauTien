import java.util.Scanner;

public class TwentyPrimeNumber {
    public static void main(String[] args) {
        int input;
        int count=0;
        int n=2;
        boolean check=false;
        StringBuilder result= new StringBuilder();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        input=sc.nextInt();

        while (count < input) {
            check=PrimeNumberCheck(n);
            if (check){
                result.append(" ").append(n);
                count++;
            }
            n++;
        }

        System.out.print(input+" So nguyen to dau tien: "+result);
    }

    public static boolean PrimeNumberCheck(int number){
        if (number<2){
            return false;
        }
        else {
            for (int i=2; i<number-1; i++){
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
