package pl.com.bbcr.springstart.rest.cars.boundary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.com.bbcr.springstart.rest.cars.control.CarMapper;
import pl.com.bbcr.springstart.rest.cars.entity.CarDTO;
import pl.com.bbcr.springstart.service.cars.boundary.CarsService;
import pl.com.bbcr.springstart.service.cars.entity.Car;

import java.util.List;

@Controller
public class CarsController {

    @Autowired
    private CarsService service;
    @Autowired
    private CarMapper mapper;

    @GetMapping("/cars")
    @ResponseBody
    public List<CarDTO> getCars() {
        List<Car> cars = service.getCars();
        return mapper.mapCars(cars);
    }

    @GetMapping("/cars/{id}")
    @ResponseBody
    public ResponseEntity<CarDTO> getCars(@PathVariable Integer id) {
        Car car = service.getCar(id);
        return car != null ? ResponseEntity.ok(mapper.mapCar(car)) : ResponseEntity.notFound().build();
    }

}
