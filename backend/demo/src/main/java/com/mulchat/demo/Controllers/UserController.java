package com.mulchat.demo.Controllers;

import java.beans.JavaBean;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mulchat.demo.Entities.Users;
import com.mulchat.demo.Services.UserService;
@CrossOrigin(origins = "http://localhost:3000") 
@RestController
@RequestMapping("/users")
@JavaBean
public class UserController {
    @Autowired
    private UserService userService;

    // @GetMapping
    // public List<Users> getAllUsers() {
    //     return userService.getAllUsers();
    // }
    @PostMapping
    public Users saveUser(@RequestBody Users user) {
        return userService.createUser(user);
    }
    @GetMapping("good/{id}")
    public Optional<Users> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    
    // @PutMapping("/{id}")
    // public Users updateUser(@PathVariable Long id, @RequestBody Users userDetails) {
    //     return userService.updateUser(id, userDetails);
    // }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}