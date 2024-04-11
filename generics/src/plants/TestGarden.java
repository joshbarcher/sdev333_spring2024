package plants;

public class TestGarden {
    public static void main(String[] args) {
        Plant weed = new Plant("weed");
        Flower flower = new Flower("Tulip", 6);

        Garden<Plant> garden = new Garden<>(weed);
        System.out.println(garden.getThing());

        //Garden<String> weirdGarden = new Garden<>(weed);
        //Garden<String> weirdGarden = new Garden<>("weed");

        Garden<Plant> flowerGarden = new Garden<>(flower);
        System.out.println(flowerGarden);

        Garden anotherGarden = new Garden(weed);
        System.out.println(anotherGarden);

        FlowerGarden favoriteGarden = new FlowerGarden(flower, "Tulip Pit");
    }
}
