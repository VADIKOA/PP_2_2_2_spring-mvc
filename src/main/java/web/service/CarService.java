package web.service;

import web.models.Car;

import java.util.List;

public interface CarService {
    int sizeCarList();

    List<Car> carList();
}
