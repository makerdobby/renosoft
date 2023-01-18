package kr.renosoft.home.work.web;

import groovy.util.logging.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
@RequestMapping("/work")
public class WorkController {

    @GetMapping("/{workSite}")
    public ModelAndView getWork(@PathVariable String workSite) throws Exception {
        return new ModelAndView("work/".concat(workSite));
    }

}
