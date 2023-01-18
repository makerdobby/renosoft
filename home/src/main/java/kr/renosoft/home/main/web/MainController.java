package kr.renosoft.home.main.web;

import groovy.util.logging.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class MainController {

    @GetMapping("/")
    public ModelAndView main() throws Exception {
        return new ModelAndView("main");
    }

    @GetMapping("/error")
    public ModelAndView error() throws Exception {
        return new ModelAndView("error");
    }

    @GetMapping(value="/robots.txt", produces="text/plain")
    public @ResponseBody ResponseEntity robots() throws Exception {

        StringBuilder sb = new StringBuilder();

        sb.append("User-Agent: *");
        sb.append("\n");
        sb.append("Disallow:");

        return new ResponseEntity(sb.toString(), HttpStatus.OK);

    }

}
