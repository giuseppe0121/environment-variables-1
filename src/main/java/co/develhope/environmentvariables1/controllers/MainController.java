package co.develhope.environmentvariables1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Value("${myCustomProps.devName}")
    private String devName;

    @Value("${myCustomProps.authCode}")
    private String authCode;


    @GetMapping("")
    public String getProperty(){
        return devName +" "+ authCode;
    }

}