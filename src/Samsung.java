public class Samsung extends Phone implements Printable{
    private int batteryPower;
    private int megapixels;
    private int price;

    public Samsung(String model, int year, String color, int batteryPower, int megapixels, int price) {
        super(model, year, color);
        this.batteryPower = batteryPower;
        this.megapixels = megapixels;
        this.price = price;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public int getMegapixels() {
        return megapixels;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Model: " + getModel() +
                "\nYear: " + getYear() +
                "\nColor: " + getColor() +
                "\nBattery Power: " + this.batteryPower +
                "\nMegapixels: " + this.megapixels +
                "\nPrice: " + this.price + "$");
    }
}
