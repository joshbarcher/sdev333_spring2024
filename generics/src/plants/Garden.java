package plants;


public class Garden<T extends Plant> {
    private T thing;

    public Garden(T thing) {
        this.thing = thing;
    }

    public T getThing() {
        return thing;
    }

    @Override
    public String toString() {
        return "Garden{" +
                "thing=" + thing +
                '}';
    }
}
