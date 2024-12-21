package com.naveen.packersmovers.controller;

import com.naveen.packersmovers.model.Driver;
import com.naveen.packersmovers.service.PackersMoversService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/driver")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class PackersMoversController {

    @Autowired
    private PackersMoversService userService;

    @PostMapping("/driverDetails")
    public String driverDetails(@RequestBody Driver driver) {
        userService.saveUser(driver);
        return "New user is added";
    }

    @GetMapping("/ping")
    public String ping() {
        return "Hi, this is Madhu";
    }

}
