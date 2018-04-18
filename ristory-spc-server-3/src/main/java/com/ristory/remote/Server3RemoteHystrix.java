package com.ristory.remote;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class Server3RemoteHystrix implements Server3Remote {

    @Override
    public String server3to1(@RequestParam(value = "name") String name ){
        return "server3to1 " +name+", this messge send failed ";
    }

}
