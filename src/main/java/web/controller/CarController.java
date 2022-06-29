package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String cars(Model model, HttpServletRequest request) {
        String count = request.getParameter("count");
        if ((count != null) && (Integer.parseInt(count) < 5)) {
            model.addAttribute("cars", carService.carList().subList(0, Integer.parseInt(count)));
        } else {
            model.addAttribute("cars", carService.carList());
        }

        return "cars";
    }
}
