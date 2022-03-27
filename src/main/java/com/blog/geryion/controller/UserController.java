package com.blog.geryion.controller;

import com.blog.geryion.common.utils.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    //login
    @PostMapping(value = "/login")
    public Result login() {
        return Result.buildSuccessResult().data("token", "admin");
    }

    @GetMapping("/info")
    public Result info() {
        return Result.buildSuccessResult()
                .data("roles", "[admin]")
                .data("name", "admin")
                .data("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    }
}
