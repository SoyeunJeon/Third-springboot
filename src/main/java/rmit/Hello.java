package rmit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CoT on 10/12/17.
 */
@RestController
@EnableAutoConfiguration
public class Hello {

    @RequestMapping("/")
    public String Hello(){
        return "Hello";
    }

    public static void main(String[] args){

        SpringApplication.run(Hello.class, args);
    }
}
