package com.techprimers.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spt.common.vo.Distance;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping
    public String hello() {
    	
        return "Hello AWS - port changed - 50002" + getDistance().toString() ;
    }
    
    public Distance getDistance() {
    	Distance d=new Distance();
    	d.setDestLat("1000001");
    	d.setDestLong("1000002");
    	d.setDestName("India");
    	return d;
    }
}
