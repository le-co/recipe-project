package guru.leco.recipes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", "/index", "/index.html"})
public class IndexController {

    @RequestMapping
    public String index(){
        return "index";
    }
}
