package test;

import structures.Bag;

public class BagDriver
{
    public static void main(String[] args)
    {
        Bag<String> bagOfColors = new Bag<>(5);
        Bag<Integer> bagOfNums = new Bag<>(10);

        bagOfColors.add("Blue");
        bagOfColors.add("Green");
        bagOfColors.add("Purple");
        bagOfColors.add("Red");
        bagOfColors.add("White");

        System.out.println(bagOfColors);

        System.out.println("contains(Blue): " + bagOfColors.contains("Blue"));
        System.out.println("contains(Red): " + bagOfColors.contains("Red"));

        System.out.println(bagOfColors.remove("Purple"));
        System.out.println(bagOfColors);

        System.out.println();

        for (String color : bagOfColors) {
            bagOfColors.add("orange");
            System.out.println(color);
        }
    }
}
