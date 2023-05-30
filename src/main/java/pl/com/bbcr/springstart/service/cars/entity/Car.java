package pl.com.bbcr.springstart.service.cars.entity;

public class Car {

    private Integer id;
    private String brand;
    private String model;

    public Car(Integer id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public Integer getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
