package pl.com.bbcr.springstart.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;
import pl.com.bbcr.springstart.service.cars.boundary.CarsService;
import pl.com.bbcr.springstart.service.cars.entity.Car;

@Controller
public class WebController {

    @Autowired
    private CarsService service;

    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("cars", service.getCars());
        return "index";
    }

    @RequestMapping(value = "/create-car", method = RequestMethod.GET)
    public String createCar(Model model) {
        model.addAttribute("car", new CarCreateRequest());
        return "create-car";
    }

    @RequestMapping(value = "/create-car", method = RequestMethod.POST)
    public RedirectView createCarSubmit(@ModelAttribute(value = "car") CarCreateRequest carCreateRequest) {
        service.createCar(new Car(10, carCreateRequest.getBrand(), carCreateRequest.getModel()));
        return new RedirectView("/");
    }

//    @RequestMapping(value = "/showForm", method= RequestMethod.GET)
//    public String showForm(Model model) {
//        Foo foo = new Foo();
//        foo.setBar("bar");
//
//        model.addAttribute("foo", foo);
//        return "create-car";
//    }
//
//    @RequestMapping(value = "/processForm", method=RequestMethod.POST)
//    public String processForm(@ModelAttribute(value="foo") Foo foo) {
//        System.out.println(foo.getBar());
//        return "index";
//    }

}
