import java.util.Scanner;

public class Main {
    private Scanner userInput = new Scanner(System.in);


    public static void main(String[]args) {
        Main program = new Main();
        program.run();
    }



    private void run() {

        //intro
        System.out.println("---------Welcome to beer calculator!---------");
        drawBeer();

        System.out.println("Lets make a beer!!");
        makeBeer();
    }

    private void drawBeer(){
        System.out.println("  .   *   ..  . *  *\n" +
                "*  * @()Ooc()*   o  .\n" +
                "    (Q@*0CG*O()  ___\n" +
                "   |\\_________/|/ _ \\\n" +
                "   |  |  |  |  | / | |\n" +
                "   |  |  |  |  | | | |\n" +
                "   |  |  |  |  | | | |\n" +
                "   |  |  |  |  | | | |\n" +
                "   |  |  |  |  | | | |\n" +
                "   |  |  |  |  | \\_| |\n" +
                "   |  |  |  |  |\\___/\n" +
                "   |\\_|__|__|_/|\n" +
                "    \\_________/");


    }
    private void makeBeer() {
        //grab the variables
        System.out.println("What do you want to name your beer?");
        String beerName = userInput.nextLine();
        System.out.println("What do you want the ABV% to be?");
        Double aBV = userInput.nextDouble();
        userInput.nextLine();
        System.out.println("What style beer is this going to be?");
        String beerStyle = userInput.nextLine();
        //make the beer
        Beer currentBeer = new Beer(beerName,aBV,beerStyle);
        //finisher statement
        System.out.format("You need %.2f",currentBeer.getGrainWeightToHitABV());
        System.out.println(" lbs. of grain to make 6 gallons of " +
                currentBeer.getBeerName() +
                ", Your " +
                currentBeer.getABV() +
                "% " +
                currentBeer.getBeerStyle());
    }







}
