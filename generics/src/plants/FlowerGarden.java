package plants;

public class FlowerGarden extends Garden<Flower> {
    private String gardenName;

    public FlowerGarden(Flower thing, String gardenName) {
        super(thing);
        this.gardenName = gardenName;
    }

    public String getGardenName() {
        return gardenName;
    }

    @Override
    public String toString() {
        return "FlowerGarden{" +
                "gardenName='" + gardenName +
                " flower=" + getThing() +
                '}';
    }
}
