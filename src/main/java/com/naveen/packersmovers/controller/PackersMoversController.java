package com.naveen.packersmovers.controller;

import com.naveen.packersmovers.messageservice.MessageService;
import com.naveen.packersmovers.model.Customer;
import com.naveen.packersmovers.service.PackersMoversService;

//import com.naveen.userinfo.service.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/home")
@CrossOrigin

public class PackersMoversController {
        @Autowired
        private PackersMoversService userService;
                
        @Autowired
        private MessageService messageService;
        
        @PostMapping("/customerDetails")
        public String customerDetails(@RequestBody Customer customer){
            userService.saveUser(customer);
            messageService.sendMessage(customer);
            return "New user is added";
        }
        
        
        @GetMapping("/ping")
        public String ping() {  return "Hi this is Uppala Naveen" ;
        			
        }
        
        @GetMapping("/name")
        public String demo() {  return "My name is Sravan" ;
        			
        }        

    }
