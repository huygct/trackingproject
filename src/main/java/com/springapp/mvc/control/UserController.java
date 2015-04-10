package com.springapp.mvc.control;

import com.springapp.mvc.repository.UserRepository;
import com.springapp.mvc.model.User;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/")
    public String home(ModelMap model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public String login(@ModelAttribute("user") User user, ModelMap model, HttpSession session) {
        List<User> userList = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
        if (userList.size() != 0) { // have account
            // save session
            session.setAttribute("adminSession", userList.get(0).getEmail());
            return "home";
        }
        else { //Login fail
            return "redirect:/";
        }
    }

    @RequestMapping(value = "/newAccount", method = RequestMethod.GET)
    public String newAccount(ModelMap model, HttpSession session) {
        session.invalidate();
        model.addAttribute("user", new User());
        return "newAccount";
    }

    @RequestMapping(value = "/newAccount", method = RequestMethod.POST)
    public String saveNewAccount(@ModelAttribute("user") User user, ModelMap model, HttpSession session) {
        session.invalidate();

        if(user.getBadgeId() != 0 || user != null) {
            userRepository.save(user);
            return "home";
        }
        return "newAccount";
    }

//    @RequestMapping(value = "/api/users", method = RequestMethod.GET)
//    public
//    @ResponseBody
//    String listUsersJson(ModelMap model) throws JSONException {
//        JSONArray userArray = new JSONArray();
//        for (User user : userRepository.findAll()) {
//            JSONObject userJSON = new JSONObject();
//            userJSON.put("id", user.getId());
//            userJSON.put("firstName", user.getFirstName());
//            userJSON.put("lastName", user.getLastName());
//            userJSON.put("email", user.getEmail());
//            userArray.put(userJSON);
//        }
//        return userArray.toString();
//    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user, BindingResult result) {
        userRepository.save(user);
        return "redirect:/";
    }

    @RequestMapping("/delete/{userId}")
    public String deleteUser(@PathVariable("userId") Long userId) {
        userRepository.delete(userRepository.findOne(userId));
        return "redirect:/";
    }

    @RequestMapping("/userList")
    public @ResponseBody List<User> userList() {
//        List<String> r = new ArrayList<String>();
//        r.add("dsfdsfdsf");
//        r.add("dsfdsfdsfdsf");
//        r.add("sdfsdfdfdsf");
        return  userRepository.findAll();
    }

    @RequestMapping(value = "/removeUser", method = RequestMethod.DELETE)
    public @ResponseBody void removeUser() {
        System.out.println("Nghi------------------------");

    }
}