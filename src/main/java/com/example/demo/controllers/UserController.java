package com.example.demo.controllers;

import com.example.demo.model.MyUsers;
import com.example.demo.repos.MyUsersRepository;
import com.example.demo.services.MyUserService;
import com.example.demo.services.MyUserServiceQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
  @Autowired
  private MyUserServiceQuery myUserServiceQuery;
  @Autowired
  private MyUsersRepository repository;
   @GetMapping("/index")
    public String index (Model model){

        return "index";
    }
  @GetMapping("/users")
    public String allUsers(Model model){

      model.addAttribute("use",myUserServiceQuery.getAll());
      return "users";
  }
  @GetMapping("/tuser/{id}")
  public String tuser (@PathVariable("id") Long id, Model model){
    model.addAttribute("tuser", myUserServiceQuery.getById(id));
    return "tuser";
  }
    /*@GetMapping("deleted/{id}")
    public String deleteUser(@PathVariable("id") Long id, Model model){
       myUserServiceQuery.userDelete(id);
        return "redirect:/users";
    }*/
    @RequestMapping("/tuser/deleted/{id}")
    public String deleteUser(@PathVariable("id") Long id, Model model){

        myUserServiceQuery.userDelete(id);
        return "redirect:/users";
    }


}
