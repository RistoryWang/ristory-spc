package com.ristory.remote;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class Server1RemoteHystrix implements Server1Remote {

    @Override
    public String server1to2(@RequestParam(value = "name") String name ){
        return "server1to2 " +name+", this messge send failed ";
    }

}
