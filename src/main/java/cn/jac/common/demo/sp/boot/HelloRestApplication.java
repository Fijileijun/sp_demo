package cn.jac.common.demo.sp.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring boot rest api simple demo
 *
 * Created by Jacobs Lei on 2017/7/25.
 * @author Jacobs Lei
 */
@SpringBootApplication
@RestController
public class HelloRestApplication {

    @RequestMapping("/")
    public String greeting() {
        return "Hello World!";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloRestApplication.class, args);
    }
}