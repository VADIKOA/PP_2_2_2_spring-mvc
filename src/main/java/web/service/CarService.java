package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    private static int CAR_ID;
    private List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car(++CAR_ID, "GAZ", "21"));
        carList.add(new Car(++CAR_ID, "VAZ", "2101"));
        carList.add(new Car(++CAR_ID, "BMW", "e46"));
        carList.add(new Car(++CAR_ID, "ZIL", "131"));
        carList.add(new Car(++CAR_ID, "MAZ", "500"));
    }

    public int sizeCarList () {
        return carList.size();
    }

    public List<Car> carList() {
        return carList;
    }
}
