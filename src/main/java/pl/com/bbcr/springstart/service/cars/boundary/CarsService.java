package pl.com.bbcr.springstart.service.cars.boundary;

import org.springframework.stereotype.Service;
import pl.com.bbcr.springstart.service.cars.entity.Car;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class CarsService {

    private List<Car> cars = Arrays.asList(
            new Car(1, "BMW", "Series 1"),
            new Car(2, "Ford", "Focus"),
            new Car(3, "Toyota", "Avensis")
    );

    public List<Car> getCars() {
        return cars;
    }

    public Car getCar(Integer id) {
        return cars.stream().filter(c -> Objects.equals(c.getId(), id)).findAny().orElse(null);
    }
}
