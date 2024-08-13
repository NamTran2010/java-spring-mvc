package vn.namtran.laptopshop.controller;

import vn.namtran.laptopshop.domain.User;
import vn.namtran.laptopshop.repository.UserRepository;
import vn.namtran.laptopshop.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("nam", "test");
        model.addAttribute("tran", "from controller with model");

        return "hello";
    }

    @RequestMapping("/admin/user")
    public String getUserPage(Model model) {
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

    @RequestMapping(value = "/admin/user/create1", method = RequestMethod.POST)
    public String createUserPage(Model mode, @ModelAttribute("newUser") User namtran2010) {
        System.out.println("run here " + namtran2010);
        this.userService.handleSaveUser(namtran2010);
        return "hello";
    }
}