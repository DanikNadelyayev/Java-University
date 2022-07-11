package com.project.service;

import com.project.models.OilRig;
import com.project.storage.OilRigStorage;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OilRigService {

    private static final int oilRigId = 0;
    private final HashMap<Integer, OilRig> oilRigStorageService = new HashMap<>();

    public List<OilRig> getAllOilRigs() {
        return new LinkedList<>(this.oilRigStorageService.values());
    }

    public OilRig getById(int id) {
        return oilRigStorageService.getOrDefault(id, null);
    }

    public void deleteOilRig(int id) {
        if (oilRigStorageService.containsKey(id)) {
            this.oilRigStorageService.remove(id);
        }
    }

    public OilRig addOilRig (OilRig oilRig) {
        try {
            final int id = oilRigId + 1;
            oilRig.setId(id);
            oilRigStorageService.put(oilRig.getId(), oilRig);
            return oilRig;
        } catch (NullPointerException e) {
            return null;
        }
    }

    public void update(OilRig oilRig, int id) {
        if (oilRigStorageService.containsKey(oilRig.getId())) {
            try {
                this.oilRigStorageService.remove(id);
                oilRigStorageService.put(id, oilRig);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

}
