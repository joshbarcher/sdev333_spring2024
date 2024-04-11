package plants;

public class Plant {
    private String type;

    public Plant(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "type='" + type + '\'' +
                '}';
    }
}
