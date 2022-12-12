package com.kob.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zz
 * @create 2022-12-09 23:02
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "pk/index.html";
    }
}
