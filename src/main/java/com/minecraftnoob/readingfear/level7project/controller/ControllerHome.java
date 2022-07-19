package com.minecraftnoob.readingfear.level7project.controller;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
@org.springframework.stereotype.Controller
public class ControllerHome {
    @GetMapping("/") @ResponseStatus(HttpStatus.MOVED_PERMANENTLY)
    String Home() {
        return "redirect:swagger-ui.html";
    }
}