package com.easy.dever.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class IndexController {

    @RequestMapping("")
    public String goIndex () {
        return "index";
    }

    @RequestMapping("/html")
    public String goIndex1 () {
        return "index1";
    }
}
