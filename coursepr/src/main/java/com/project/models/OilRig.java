package com.project.models;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
@Entity
@Getter
@Setter
@NoArgsConstructor
public class OilRig {

    private int id;
    private String name = "Default";

    private String coordinates;

    private float amountOfOilProductionPerDay;

    private int fillingOfTank;



    public OilRig (String name, String coordinates, float amountOfOilProductionPerDay, int fillingOfTank ) {
        this.name = name;
        this.coordinates = coordinates;
        this.amountOfOilProductionPerDay = amountOfOilProductionPerDay;
        this.fillingOfTank = fillingOfTank;
    }

    public static String getHeaders() {
        return "name of Oil rig, coordinates, amount of production per day, filling of tanks";
    }

    public String toCSV() {
    return this.getName() + "," + this.getCoordinates() + "," + this.getAmountOfOilProductionPerDay() + "," + this.getFillingOfTank();
    }

}
