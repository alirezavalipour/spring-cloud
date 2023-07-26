package ir.alirezavalipour.clouddemo.user.controller;

import ir.alirezavalipour.clouddemo.user.dto.MainDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;

@RestController

public class IndexController {

    @GetMapping("/")
    public MainDTO get() {
        return new MainDTO();
    }
}
