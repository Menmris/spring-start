package pl.com.bbcr.springstart.rest.cars.entity;

public class CarDTO {

    private String brand;
    private String model;

    public CarDTO() {
    }

    public CarDTO(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
