package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@Api(value = "MyTest",description = "MyTest")
public class MyTest {

    @ApiOperation("[Test] hhhhh")
    @RequestMapping(method = RequestMethod.GET)
    public String dell() {
        return "hello";
    }

    @ApiOperation("fadsfa")
    @RequestMapping(method = RequestMethod.DELETE)
    public String delete () {
        return "myfds";
    }

}
