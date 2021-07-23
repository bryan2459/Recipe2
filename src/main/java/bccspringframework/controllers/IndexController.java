package bccspringframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


    @RequestMapping({"/","","index"})
    String getIndexPage(){

        return "index";
    }
}
