package com.project.service;

import com.project.models.OilRig;
import com.project.storage.OilRigStorage;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;

@Service
public class OilRigService {

    public Set<Map.Entry<Integer,OilRig>> getAllOilRig() {
        OilRig statfjordBPlatform = new OilRig(1,"Statfjord B Platform", "61°14'09.2", 250000f,  40, "5.6.2022" );
        OilRig equinor = new OilRig(2, "Equinor", "61 ° 15'20", 70000f, 80, "14.6.2022" );

        OilRigStorage oilRigStorage = new OilRigStorage();
        oilRigStorage.add(statfjordBPlatform);
        oilRigStorage.add(equinor);

        return oilRigStorage.getAllInfo();
    }


}
