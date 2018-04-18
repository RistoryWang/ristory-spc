package com.ristory.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="ristory-spc-server-2",fallback = Server1RemoteHystrix.class)
public interface Server1Remote {

    @RequestMapping(value = "/server2")
    public String server1to2(@RequestParam(value = "name") String name);

}
