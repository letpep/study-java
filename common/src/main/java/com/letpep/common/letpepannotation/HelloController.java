package com.letpep.common.letpepannotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
        @RequestMapping(value = "/hellott")
    public String hello(@RequestParam){
        return "view";
    }
}
