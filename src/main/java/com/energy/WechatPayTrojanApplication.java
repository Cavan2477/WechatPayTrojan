package com.energy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class WechatPayTrojanApplication
{
    @RequestMapping("/test")
    public String test()
    {
        return "This is test page";
    }

    public static void main(String[] args)
    {
        SpringApplication.run(WechatPayTrojanApplication.class, args);
    }
}
