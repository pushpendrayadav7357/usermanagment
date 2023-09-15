package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/addUser")
//    public User addUser(@RequestBody User user){
//        return userRepository.save(user);
//    }
    @GetMapping("/getUser/{userId}")
    public ResponseEntity<User>getUser(@PathVariable Long userId) {
        Optional<User> user = userRepository.findById(userId);
        return user.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PutMapping("/updateUserInfo/{userId}")
    public User updateUserInfo(@PathVariable Long userId, @RequestBody User user) {
        User existingUser = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id " + userId));

        // Update user attributes here
        existingUser.setName(user.getName());
        existingUser.setUserName(user.getUserName());
        existingUser.setAddress(user.getAddress());
        existingUser.setPhoneNumber(user.getPhoneNumber());

        return userRepository.save(existingUser);
    }
@DeleteMapping("/deleteUser/{userId}")
public void deleteUser(@PathVariable Long userId) {
    User user = userRepository.findById(userId)
            .orElseThrow(() -> new ResourceNotFoundException("User not found with id " + userId));
    userRepository.delete(user);
}
}

