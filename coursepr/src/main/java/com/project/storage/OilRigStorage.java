package com.project.storage;

import com.project.models.OilRig;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OilRigStorage {

    public Map <Integer, OilRig> oilRigMap = new HashMap<>();

    public void add(OilRig oilRig) {
        oilRigMap.put(oilRig.getId(), oilRig);

    }


}
