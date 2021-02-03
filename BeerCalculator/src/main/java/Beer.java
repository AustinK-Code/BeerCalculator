import java.util.List;

public class Beer {
    private String beerName;
    private Double aBVrequest;
    private String beerStyle;
    private Double grainWeight;
    private List<String> hopFlavorProfile;
    private List<String> maltFlavorProfile;
    private int bitterness1To10;



    public Beer(String beerName, Double aBVrequest, String beerStyle) {
        this.beerName = beerName;
        this.aBVrequest = aBVrequest;
        this.beerStyle = beerStyle;
    }

    public String getBeerName() {
        return beerName;
    }

    public String getBeerStyle() {
        return beerStyle;
    }

    public Double getABV() {
        return aBVrequest;
    }

    public Double getGrainWeightToHitABV() {
        this.grainWeight = (getABV() / .71) * 1.33;
        return this.grainWeight;
    }
}
