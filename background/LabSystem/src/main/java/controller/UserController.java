package controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pojo.User;
import service.UserService;

@CrossOrigin
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public static Logger log = Logger.getLogger(UserController.class.getClass());

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestBody User user) {

        log.info("UserAccount:" + user.getUserAccount());
        log.info("UserPassword:" + user.getPassword());

        if (userService.login(user) != null) {

            return "1";

        } else {

            return "0";

        }

    }


    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    @ResponseBody
    public String logout(@RequestBody String message) {     // 登出

        log.info("id:" + message);

        if (message.equals("1")) {

            return "id";

        }

        return "2";

    }


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public String addUser(@RequestBody User user) {

        userService.addUser(user);
        return null;

    }


    @RequestMapping(value = "/modifyPassword", method = RequestMethod.POST)
    @ResponseBody
    public String modify(@RequestBody String newPassword) {

        return null;

    }


    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
    @ResponseBody
    public String deleteUser(@RequestBody User user) {

        return null;

    }

}


