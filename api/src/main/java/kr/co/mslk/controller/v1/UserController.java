package kr.co.mslk.controller.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/api/v1")
public class UserController {

    @GetMapping(value = "/user")
    public String getUserData() {
        return "";
    }
    
}
