package com.vsvegzdaite.app;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OverrideErrorController implements ErrorController {
    @RequestMapping("/error")
    public String index() { return "index.html"; }
    public String getErrorPath() { return "index.html"; }

}