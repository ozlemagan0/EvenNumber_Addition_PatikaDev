import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int a, sum=0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter a number:");
            a = sc.nextInt();

            if((a%2==0) && (a%4==0))
            {
                sum+=a;
            }
        }
        while (a % 2 == 0);
        System.out.println("Addition:"+sum);
    }
}
