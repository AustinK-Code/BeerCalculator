import java.util.Scanner;

public class BeerApplication {
    private Scanner userInput = new Scanner(System.in);


    public static void main(String[]args) {
        BeerApplication program = new BeerApplication();
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
        //fun art to add
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
