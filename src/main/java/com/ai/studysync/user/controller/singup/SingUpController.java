package com.ai.studysync.user.controller.singup;


import com.ai.studysync.user.model.User;
import org.apache.coyote.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class SingUpController {

        @PostMapping
        public String userSingUpDetails(@RequestBody User user){

            return "ok";
        }

}
