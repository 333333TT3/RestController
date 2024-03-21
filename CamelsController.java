package com.example.demo.test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
@RestController
class CamelsController {

    private List<String> camels = new ArrayList<>();

    @GetMapping("/camel")
    public List<String> getCamels() {
        return camels;
    }

    @PostMapping("/camel/add")
    public void addCamel(@RequestBody String camelName) {
        camels.add(camelName);
    }
}