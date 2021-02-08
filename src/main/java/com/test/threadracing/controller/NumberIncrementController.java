package com.test.threadracing.controller;

import com.test.threadracing.service.NumberIncrementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author amit
 * below is the controllerclass for the incrementing the number
 */

@RestController
public class NumberIncrementController {

    @Autowired
    private NumberIncrementService numberIncrementService;

    //Welcome page, non-rest

    @RequestMapping("/")
    public String welcome() {
        return "Hello click <a href='increment'> Here for incrementing the number.</a>";
    }


    //Increment number, non-rest

    @GetMapping("/increment")
    public String incrementNumber() {
        return "Result :: "+numberIncrementService.incrementNumber();
    }

}
