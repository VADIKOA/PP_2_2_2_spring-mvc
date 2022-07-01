package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private static int carID;
    private List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car(++carID, "GAZ", "21"));
        carList.add(new Car(++carID, "VAZ", "2101"));
        carList.add(new Car(++carID, "BMW", "e46"));
        carList.add(new Car(++carID, "ZIL", "131"));
        carList.add(new Car(++carID, "MAZ", "500"));
    }
    @Override
    public int sizeCarList () {
        return carList.size();
    }

    @Override
    public List<Car> carList() {
        return carList;
    }
}
