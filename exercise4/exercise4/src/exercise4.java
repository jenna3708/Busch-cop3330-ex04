import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a noun:");
        String noun = input.nextLine();

        Scanner input2 = new Scanner (System.in);
        System.out.println("Enter a verb:");
        String verb = input2.nextLine();

        Scanner input3 = new Scanner (System.in);
        System.out.println("Enter an adjective:");
        String adjective = input3.nextLine();

        Scanner input4 = new Scanner (System.in);
        System.out.println("Enter an adverb:");
        String adverb = input4.nextLine();

        System.out.println("Do you "+verb+" your "+adjective+" "+noun+" "+adverb+"? That's hilarious!");
    }
}
