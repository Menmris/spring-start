package pl.com.bbcr.springstart.web;

public class CarCreateRequest {
    private String brand;
    private String model;

    public CarCreateRequest() {
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
