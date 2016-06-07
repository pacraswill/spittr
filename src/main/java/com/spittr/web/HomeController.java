package com.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Allen on 2016/4/16.
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "home";
    }
}
