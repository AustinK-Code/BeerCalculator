import java.util.Scanner;

public class BeerAppCLI{
    Scanner userInput = new Scanner(System.in);



    public Beer gatherInformationForBeer(){
        System.out.println("What do you want to name your beer?");
        String beerName = userInput.nextLine();
        System.out.println("What do you want the ABV% to be?");
        Double aBV = userInput.nextDouble();
        userInput.nextLine();
        System.out.println("What style beer is this going to be?");
        String beerStyle = userInput.nextLine();
        Beer beer = new Beer(beerName,aBV,beerStyle);
        return beer;
    }

}
