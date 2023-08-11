public class Xiaomi extends Phone implements Printable{
    private int functionsAmount;
    private String condition;
    private int price;

    public Xiaomi(String model, int year, String color, int functionsAmount, String condition, int price) {
        super(model, year, color);
        this.functionsAmount = functionsAmount;
        this.condition = condition;
        this.price = price;
    }

    public int getFunctionsAmount() {
        return functionsAmount;
    }

    public String getCondition() {
        return condition;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Model: " + getModel() +
                "\nYear: " + getYear() +
                "\nColor: " + getColor() +
                "\nFunctions Amount: " + this.functionsAmount +
                "\nCondition: " + this.condition +
                "\nPrice: " + this.price + "$");
    }
}
