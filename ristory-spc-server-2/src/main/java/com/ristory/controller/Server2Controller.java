package com.ristory.controller;


import com.ristory.remote.Server2Remote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Server2Controller {


    @Autowired
    Server2Remote server2Remote;

    @RequestMapping("/server2to3/{name}")
    public String server2to3(@PathVariable("name") String name){

        return server2Remote.server2to3(name);
    }

    @RequestMapping("/server2")
    public String server2(@RequestParam String name) {

        return "server2 "+name+"，this is first messge";
    }

}
