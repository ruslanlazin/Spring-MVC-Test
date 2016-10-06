package ua.pp.lazin;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping
    @ResponseBody
    public User sayHello() {

        User user = new User();
        user.setEmail("hgkgfjgfjhfhf");
        user.setFirstName("hh");
        user.setLastName("hhh");
        user.setPassword("uu");
        user.setLogin("gg");


        return user;
    }

}
