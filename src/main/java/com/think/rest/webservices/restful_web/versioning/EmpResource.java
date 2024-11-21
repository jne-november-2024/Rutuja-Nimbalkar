package com.think.rest.webservices.restful_web.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpResource {

    //UrL versioning
         @GetMapping("/v1/person")
        public PersonV1 getName(){

        return new PersonV1("Smith Doe");
        }


    @GetMapping("/v2/person")
    public PersonV2 getSecName(){

        return new PersonV2(new Name("Smith","Deo"));
    }


    //Request Parameter
    //http://localhost:8080/person?version=2
    @GetMapping(path ="/person" ,params = "version=1")
    public PersonV1 getNameRequestP(){

        return new PersonV1("Smith Doe");
    }



    @GetMapping(path = "/person",params = "version=2")
    public PersonV2 getSecNameRequestP2(){

        return new PersonV2(new Name("Smith","Deo"));
    }

    //(Custom) header versioning

    @GetMapping(path = "/person/h",headers = "X-API-VERSION=1")
    public PersonV1 getNameHeaderRequest(){

        return new PersonV1("Smith Doe");
    }


    @GetMapping(path = "/person/h", headers = "X-API-VERSION=2")
    public PersonV2 getNameHeaderRequest2(){

        return new PersonV2(new Name("Smith","Deo"));
    }

    //Media type

    @GetMapping(path = "/person/accept",produces = "application/vnd.company.app-v1+json")
    public PersonV1 getNameM1(){

        return new PersonV1("Smith Doe");
    }


    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
    public PersonV2 getNameM2(){

        return new PersonV2(new Name("Smith","Deo"));
    }


}
