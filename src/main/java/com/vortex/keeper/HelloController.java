package com.vortex.keeper;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("xiaozhao")
    public String hell0() {
        return "Hello zhaomengxia";
    }

}
