public class Iphone extends Phone implements Printable{
    private int megaPixels;
    private int memory;
    private int price;

    public Iphone(String model, int year, String color, int megaPixels, int memory, int price) {
        super(model, year, color);
        this.megaPixels = megaPixels;
        this.memory = memory;
        this.price = price;
    }

    public int getMegaPixels() {
        return megaPixels;
    }

    public int getMemory() {
        return memory;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Model: " + getModel() +
                "\nYear: " + getYear() +
                "\nColor: " + getColor() +
                "\nMegPixels: " + this.megaPixels +
                "\nMemory: " + this.memory +
                "\nPrice: " + this.price + "$");
    }
}
