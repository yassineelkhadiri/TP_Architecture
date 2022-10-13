package com.directi.training.srp.exercise;

public class CarRating {

    private CarDb _carDb = new CarDb();
    
    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : _carDb.getAllFromDb()) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }

}
