package plants;

public class Flower extends Plant {
    private int numPetals;

    public Flower(String type, int numPetals) {
        super(type);
        this.numPetals = numPetals;
    }

    public int getNumPetals() {
        return numPetals;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "numPetals=" + numPetals +
                '}';
    }
}
