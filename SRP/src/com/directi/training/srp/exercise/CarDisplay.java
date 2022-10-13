package com.directi.training.srp.exercise;

public class CarDisplay {
    private final CarDb _carDb = new CarDb();


    public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carDb.getAllFromDb()) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
