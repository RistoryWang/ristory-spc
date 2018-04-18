package com.ristory.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="ristory-spc-server-3",fallback = Server2RemoteHystrix.class)
public interface Server2Remote {

    @RequestMapping(value = "/server3")
    public String server2to3(@RequestParam(value = "name") String name);

}
