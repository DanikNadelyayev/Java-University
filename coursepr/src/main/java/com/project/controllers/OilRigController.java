package com.project.controllers;

import com.project.models.OilRig;
import com.project.service.OilRigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Map;
import java.util.Set;

@RestController
public class OilRigController {

    private final OilRigService oilRigService;

    @Autowired
    public OilRigController(OilRigService oilRigService) {
        this.oilRigService = oilRigService;
    }

    @PostMapping("/OilRigs")
    public void create(@RequestBody OilRig oilRig) {
        oilRigService.createOilRig(oilRig);
    }

    @GetMapping("/OilRigs")
    public Set<Map.Entry<Integer, OilRig>> oilRigMap() {

        return oilRigService.getAllOilRig();
    }

    @GetMapping("/OilRigs/{id}")
    public OilRig getId(@PathVariable int id) {
        return oilRigService.getById(id);
    }

    @DeleteMapping("/OilRigs/{id}")
    public void deleteById(@PathVariable int id) {
        oilRigService.deleteOilRig(id);
    }

    @PutMapping("/OilRigs/{id}")
    public void update(@RequestBody OilRig oilRig, @PathVariable int id) {
        oilRigService.update(oilRig, id);
    }
}

