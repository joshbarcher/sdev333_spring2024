package range;

public class RangeTester {
    public static void main(String[] args) {
        //range.RangeIterator iter = new range.RangeIterator(range);

        /*while (iter.hasNext()) {
            int num = iter.next();
            System.out.println(num);
        }*/

        //this will throw an exception
        /*for (int i = 0; i < 25; i++) {
            int num = iter.next();
            System.out.println(num);
        }*/

        //11 numbers in the range - 7, 8, 9, ... , 17
        Range range = new Range(7, 15);

        for (int num : range) {
            System.out.println(num);
        }
    }
}
