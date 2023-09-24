package com.postgresql.demo.hlm;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")

public class UserController {
        private List<User> users = new ArrayList<>();
        private Long nextUserId = 1L;

        @PostMapping("/add-user")
        public User addUser(@RequestBody User user) {
            user.setId(nextUserId++);
            users.add(user);
            return user;
        }

        @PostMapping("/update-user")
        public User updateUser(@RequestBody User updatedUser) {
            for (int i = 0; i < users.size(); i++) {
                User user = users.get(i);
                if (user.getId().equals(updatedUser.getId())) {
                    user.setId(updatedUser.getName());
                    user.setId(updatedUser.getMajor());
                    return user;
                }
            }
            return null;
        }

        @GetMapping("/get-all-user")
        public List<User> getAllUsers() {
            return users;
        }

        @GetMapping("/get-user/{id}")
        public User getUserById(@PathVariable Long id) {
            for (User user : users) {
                if (user.getId().equals(id)) {
                    return user;
                }
            }
            return null;
        }
    }

