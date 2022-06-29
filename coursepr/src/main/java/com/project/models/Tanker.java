package com.project.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor
public class Tanker {

    private int id;

    private String name;

    private String dateOfShipmentOil;



    public String getHeaders() {
        return "name, date of oil shipment ";
    }
    public String toCSV() {
        return this.getName() + "," + this.getDateOfShipmentOil();

    }

}

