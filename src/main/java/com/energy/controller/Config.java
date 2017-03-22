package com.energy.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/3/23.
 */
@RestController
@RequestMapping(value = "/v0.1")
public class Config
{
    @RequestMapping(value = "/recToken")
    @ResponseBody
    public String recToken(@RequestParam("access_token") String strAccessToken,
                           @RequestParam("expires_in") int nExpiresIn)
    {
        System.out.println("----> access_token:" + strAccessToken);
        System.out.println("----> expires_in:" + nExpiresIn);

        return "success";
    }
}
