package pl.com.bbcr.springstart.rest.cars.control;

import org.springframework.stereotype.Service;
import pl.com.bbcr.springstart.rest.cars.entity.CarDTO;
import pl.com.bbcr.springstart.service.cars.entity.Car;

import java.util.List;

@Service
public class CarMapper {

    public List<CarDTO> mapCars(List<Car> cars) {
        return cars.stream().map(this::mapCar).toList();
    }

    public CarDTO mapCar(Car car) {
        return new CarDTO(car.getBrand(), car.getModel());
    }
}
