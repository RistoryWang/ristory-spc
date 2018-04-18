package com.ristory.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="ristory-spc-server-1",fallback = Server3RemoteHystrix.class)
public interface Server3Remote {

    @RequestMapping(value = "/server1")
    public String server3to1(@RequestParam(value = "name") String name);

}
