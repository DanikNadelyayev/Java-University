package com.project.storage;

import com.project.models.OilRig;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class OilRigStorage {
    Map <Integer, OilRig> oilRigMap = new HashMap<Integer, OilRig>();

    public void oilRigToCsv() throws IOException {

        File file = new File("OilRig-2022-25-06.csv");

        if (!file.exists())
            file.createNewFile();

        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("Name,Coordinates,Production-Per-Day,Filling-of-Tanks,ID,Date-of-Shipment (from Date-of-Shipment)");
        printWriter.println("Statfjord B Platform,61°1409.2N 1°55,250,000 barrels ,40%, 1, 5.6.2022, 9.6.2022, 7.6.2022");
        printWriter.println("Wintershall,\"54 ° 01′33  \",\"18,100 barrels\",55%,\"Tanker 3,Tanker 3\",\"1.6.2022, 10.6.2022\"");

        printWriter.close();

    }

    public void add (OilRig oilRig) {
        oilRigMap.put(oilRig.getId(), oilRig);
    }
    public Set<Map.Entry<Integer, OilRig>> getAllInfo() {
        return oilRigMap.entrySet();
    }


}