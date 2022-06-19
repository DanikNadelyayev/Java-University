package com.project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
    public class OilRigController {

        @GetMapping("/oilrig")
        public String oil(
                @RequestParam(name="name", required=false, defaultValue="World") String name, Map<String, Object> model
        ) {

            model.put("name", name);
            return "oilrig";
        }
        @GetMapping
        public String main (Map<String, Object> model) {
            model.put("some", "OIL");
            return "main";
    }

    }

