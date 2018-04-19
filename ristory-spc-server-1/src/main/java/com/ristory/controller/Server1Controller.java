package com.ristory.controller;


import com.ristory.remote.Server1Remote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Server1Controller {


    @Autowired
    Server1Remote server1Remote;

    @RequestMapping("/server1to2/{name}")
    public String server1to2(@PathVariable("name") String name){

        return server1Remote.server1to2(name);
    }

    @RequestMapping("/server1")
    public String server1(@RequestParam String name) {

        return "server1 "+name+"，this is server1 messge";
    }



}
