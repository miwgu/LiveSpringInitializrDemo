package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Miwa Guhrés
 * Date: 2021-04-08
 * Time: 11:06
 * Project: LiveSpringInitializrDemo
 * Copyright: MIT
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String index(){
        return "Hello World";
    }

    @RequestMapping("/a")
    public String index2(){
        return "Hello Worldaaaaaa";
    }


    @RequestMapping("/hej")
    public String hej(@RequestParam(required = false) String name){
        if(name==null) return "Hello World";
        return "Hello "+name;
    }
    //http://localhost:8080/hej ->Hello World
    //http://localhost:8080/hej?name=Miwa -> Hello Miwa

    @RequestMapping("/hej2")
    public String hej2(@RequestParam(defaultValue = "Miwa") String firstname,
                       @RequestParam(defaultValue = "Teramachi") String lastname){
        return "Hello "+firstname+" "+lastname;
    }
    //http://localhost:8080/hej2 ->Hello Miwa Teramachi
    //http://localhost:8080/hej2?firstname=Mitsuhide&lastname=Teramachi -> Hello Mitsuhide Teramachi

    @RequestMapping("/hej3")
    public String hej3(@RequestParam List<String>names) {
        return "Hello "+names;
    }

    @RequestMapping("/hejPathParam/{name}")
    public String hejPathParam(@PathVariable String name) {
        if (name == null)return "Hello World";
        return "Hello "+name;
    }
    //http://localhost:8080/hejPathParam/Mi ->Hello Mi



}
