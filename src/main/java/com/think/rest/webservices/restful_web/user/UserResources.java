package com.think.rest.webservices.restful_web.user;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
//@RequestMapping("/users") // base class path
public class UserResources {

    @Autowired
    private UserDaoService service;

    @GetMapping(path = "/users")
    //@GetMapping(produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public List<User> retriveAll(){
        return service.findAll();
    }


    @GetMapping(path = "/users/{id}")
    public EntityModel<User> retriveOne(@PathVariable int id){

        User user= service.findOne(id);
        if(user==null){
            throw new NoSuchUserFoundException("id: "+ id);
        }
        EntityModel<User> entityModel=EntityModel.of(user);

        WebMvcLinkBuilder link= linkTo(methodOn(this.getClass()).retriveAll());
        entityModel.add(link.withRel("all-users"));

       return entityModel;
    }

//    @PostMapping(path = "/users")
//    public ResponseEntity<User> createUser(@RequestBody User user){
//
//        service.save(user);
//        return ResponseEntity.created(null).build();
//    }

//create new user and get location see newly created user
    @PostMapping(path = "/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user){
        User saved=service.save(user);
        //users/{id}  id is newly created
        URI location= ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}").buildAndExpand(saved.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

// bad request 400 get not have response body standard invalid
    /* @GetMapping(path = "/users1")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user){
        User saved=service.save(user);
        //users/{id}  id is newly created
        URI location= ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}").buildAndExpand(saved.getId()).toUri();
        return ResponseEntity.created(location).build();
    } */

    @DeleteMapping(path = "/users/remove/{id}")
    public void remove(@PathVariable int id){
        service.removeOne(id);
    }

}
