package com.ristory.remote;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class Server2RemoteHystrix implements Server2Remote {

    @Override
    public String server2to3(@RequestParam(value = "name") String name ){
        return "server2to3 " +name+", this messge send failed ";
    }

}
