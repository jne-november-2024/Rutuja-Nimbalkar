package com.think.rest.webservices.restful_web.hello;

import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;

@RestController
public class msgPrint {

     @RequestMapping(method = RequestMethod.GET, path ="/msg-hello")
    public String msg(){
        return "Hello";
    }

    @GetMapping(path ="/msg-get")
    public String get(){
        return "Hello, Get Mapping is Done";
    }

    //getting bean of existing class -- instance of own class return
    @GetMapping(path = "/get-emp-bean")
    public EmpInfo getBean(){
         return new EmpInfo("Rutuja","pune");
    }


    //Path parameter [variable]and @PathVariable to capture
    @GetMapping(path = "/get-extra/{company}")
    public EmpInfo getExtra(@PathVariable String company){
        return new EmpInfo("Rutuja","Pune"+" Company:"+company);
    }

}
