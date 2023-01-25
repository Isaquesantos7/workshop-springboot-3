package workshop.springboot3.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import workshop.springboot3.entities.User;


@RestController
@RequestMapping(value = "/users")
public class ResourceUser {
    
    User users = new User(1L, "Isaque Santos", "isaquesantos.1998@gmail.con", "7198730-8769", "86992134");

    @GetMapping
    public ResponseEntity<User> findAll() {

        return ResponseEntity.ok().body(users);
    }
}
