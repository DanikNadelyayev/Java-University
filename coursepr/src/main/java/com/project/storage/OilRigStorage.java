package com.project.storage;

import com.project.models.OilRig;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class OilRigStorage {
    Map<Integer, OilRig> oilRigMap = new HashMap<Integer, OilRig>();

    public void add(OilRig oilRig) {
        oilRigMap.put(oilRig.getId(), oilRig);
    }

    public Set<Map.Entry<Integer, OilRig>> getAllInfo() {
        return oilRigMap.entrySet();
    }

    public OilRig getById(int id) {
        if (oilRigMap.containsKey(id)) {
            return oilRigMap.get(id);
        }
        return oilRigMap.get(id);
    }

    public void saveOilRigToCsv(List<OilRig> oilRigs) throws IOException {
        Writer writer = null;
        PrintWriter printWriter = null;
        try {
            File file = new File("2022-04-07-OilRig.csv");

            if (!file.exists()) {
                file.createNewFile();
            }

            writer = new OutputStreamWriter
                    (new FileOutputStream(file), StandardCharsets.UTF_8);
            for (OilRig oilRig : oilRigs) {
                writer.write(oilRig.toCSV() + "\n");

                printWriter = new PrintWriter(file);
                printWriter.println
                        ("Name,Coordinates,Production-Per-Day,Filling-of-Tanks,ID,Date-of-Shipment (from Date-of-Shipment)");
                printWriter.println
                        ("Statfjord B Platform,61°1409.2N 1°55,250,000 barrels ,40%, 1, 5.6.2022, 9.6.2022, 7.6.2022");
                printWriter.println
                        ("Wintershall,\"54 ° 01′33  \",\"18,100 barrels\",55%,\"Tanker 3,Tanker 3\",\"1.6.2022, 10.6.2022\"");

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            writer.close();
            printWriter.close();
        }
    }
}