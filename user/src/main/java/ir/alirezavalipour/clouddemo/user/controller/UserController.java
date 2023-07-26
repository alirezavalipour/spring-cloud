package ir.alirezavalipour.clouddemo.user.controller;

import ir.alirezavalipour.clouddemo.user.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "user" )
public class UserController {

    @GetMapping("/")
    public List<UserDTO> get() {
        List<UserDTO> userDTOList = new ArrayList<>();

        userDTOList.add(new UserDTO("Ali", "Valipour", "09127928901"));
        userDTOList.add(new UserDTO("Nima", "Asadi", "09127928902"));
        userDTOList.add(new UserDTO("Yashar", "Javdani", "09127928903"));
        userDTOList.add(new UserDTO("Saman", "Sohani", "09127928904"));

        return userDTOList;


    }
}
