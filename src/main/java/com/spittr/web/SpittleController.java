package com.spittr.web;

import com.spittr.data.SpittleRepository;
import com.sun.org.glassfish.external.statistics.annotations.Reset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Allen on 2016/4/16.
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private SpittleRepository spittleRepository;

    @Autowired
    SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model) {
        model.addAllAttributes(
                spittleRepository.findSpittles(
                        Long.MAX_VALUE, 20
                )
        );
        return "spittles";
    }

}
