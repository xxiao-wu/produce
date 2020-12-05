package produce.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;
import javax.servlet.http.HttpSession;


@Controller
public class LoginController {
    @RequestMapping("/user/login")

    public String Login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model ) {
        if (!StringUtils.isEmpty(username) && "1234567".equals(password)) {

            return "index";
        } else {
            model.addAttribute("msg", "用户名或密码错误");
            return "login";
        }

    }

}
