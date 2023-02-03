package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liang.guo
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println();
        return "hello world!";
    }
}
