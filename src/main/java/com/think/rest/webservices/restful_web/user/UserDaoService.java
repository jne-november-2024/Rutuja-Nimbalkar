package com.think.rest.webservices.restful_web.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserDaoService {

    //static list of user
    private static List<User> userList=new ArrayList<>();

    static{
        userList.add(new User(1,"John", LocalDate.now().minusYears(25)));
        userList.add(new User(2,"Smith", LocalDate.now().minusYears(20)));
        userList.add(new User(3,"Adam", LocalDate.now().minusYears(30)));
        userList.add(new User(4,"Carrie", LocalDate.now().minusYears(27)));
        userList.add(new User(5,"Tom", LocalDate.now().minusYears(35)));
        userList.add(new User(6,"Crew", LocalDate.now().minusYears(45)));
        userList.add(new User(7,"Jenny", LocalDate.now().minusYears(19)));

    }

    private int countUser=8;
    public List<User> findAll(){
        return userList;
    }

    public User findOne(int id){

        //get() return if present else return the NoSuchElementFound
        //return userList.stream().filter(user -> user.getId()==id).findFirst().get();
        //getting 200 with no data
        return userList.stream().filter(user -> user.getId()==id).findFirst().orElse(null);
    }

    public User save(User user){
        user.setId(countUser++);
        userList.add(user);
        return user;
    }


    public void removeOne(int id){
        userList=userList.stream().filter(user -> user.getId()!=id).toList();
        System.out.println("Deleted..");
        findAll().stream().forEach(System.out::println);

        //.collect(Collectors.toList());
    }



}


