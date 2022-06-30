package com.project.controllers;

import com.project.models.OilRig;
import com.project.service.OilRigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;
import java.util.Map;
import java.util.Set;

@RestController
public class OilRigController {

    private final OilRigService oilRigService;


    public OilRigController(OilRigService oilRigService) {
        this.oilRigService = oilRigService;
    }

    @GetMapping ("/OilRigs")
    public Set<Map.Entry<Integer, OilRig>> oilRigMap () {

        return oilRigService.getAllOilRig();
    }

    @GetMapping ("/OilRigs/{id}")
    public OilRig getId (@PathVariable int id) {
        return oilRigService.getById(id);
    }
}

