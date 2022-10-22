public class Car {
    public String brand;
    public String model;
    public float engineVolume;
    public String color;
    public int productionYear;
    public String productionCountry;

    public Car(String brand, String model, float engineVolume, String color, int productionYear, String productionCountry) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        }else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "default";
        }else {
            this.model = model;
        }

        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        }else {
            this.productionCountry = productionCountry;
        }

        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        }else {
            this.engineVolume = engineVolume;
        }

        if (color == null || color.isEmpty()) {
            this.color = "белый";
        }else {
            this.color = color;
        }

        if (productionYear == 0) {
            this.productionYear = 2000;
        }else {
            this.productionYear = productionYear;
        }
    }
}
