package com.ristory.controller;


import com.ristory.remote.Server3Remote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Server3Controller {


    @Autowired
    Server3Remote server3Remote;

    @RequestMapping("/server3to1/{name}")
    public String server3to1(@PathVariable("name") String name){

        return server3Remote.server3to1(name);
    }

    @RequestMapping("/server3")
    public String server3(@RequestParam String name) {

        return "server3 "+name+"，this is server3 messge";
    }

}
