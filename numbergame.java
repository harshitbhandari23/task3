import java.util.*;
public class numbergame {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int min=1;
        int max=10;
        System.out.println("Enter 1 to start the game");
        System.out.println("enter 2 to stop the game");
        System.out.println("enter 3 to playagain");
        int n=sc.nextInt();
        while(n!=2)
        {int random=(int)Math.floor(Math.random()*(max-min+1)+min);
        guess(random);
        System.out.println("to playagain enter 3");
        n=sc.nextInt();
    }}
    public static void guess(int r) {
        Scanner sc = new Scanner(System.in);

        int n1 = 0;

            System.out.println("enter ur guess");
            while (n1 != r) {
                n1 = sc.nextInt();
                if (n1 > r)
                    System.out.println("too high");
                if (n1 < r)
                    System.out.println("too low");
                if(n1==r)
                    System.out.println("You won");



        }

    }}
