package pl.kaminska4nna.project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String getWelcome() {
        return "Hello World";
    }
}
