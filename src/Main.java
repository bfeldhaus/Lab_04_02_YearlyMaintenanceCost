public class Main
{

    public static void main(String[] args)
    {
	int costSummer = 250;
    int costFall = 200;
    int costSpring = 300;
    int costWinter = 400;
    int totalCost = 0;

    totalCost = costFall + costSummer + costSpring + costWinter;

        System.out.println("The maintenance cost for Summer is $" + costSummer);
        System.out.println("The maintenance cost for Fall is $" + costFall);
        System.out.println("The maintenance cost for Winter is $" + costWinter);
        System.out.println("The maintenance cost for Spring is $" + costSpring);

        System.out.println("The total yearly maintenance cost is $" + totalCost);
    }
}
