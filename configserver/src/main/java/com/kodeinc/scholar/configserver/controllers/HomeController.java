/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodeinc.scholar.configserver.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author muyin
 */
@Controller
public class HomeController {

    @ResponseBody
    @GetMapping("/") 
   public  String healthcheck() {
        return "<html><body style='text-align:center;'> <h1> SCHOLAR ENTERPRISE CONFIG </h1> </body></html>";
    }
}
