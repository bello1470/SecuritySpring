package org.bellotech.SpringSecurityRoleBase.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {

    @GetMapping("/admin")
    public String admin(){

        return "Wellcome to ADMIN PAGE";
    }

//    @GetMapping("/manager")
//    public String manager(){
//
//        return "Wellcome to MANAGER PAGE";
//    }
}
