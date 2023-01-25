package workshop.springboot3.config;

import workshop.springboot3.repository.UserRepository;
import workshop.springboot3.entities.User;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "Isaque Santos", "isaquesantos.1998@gmail.com", "71 98730-8769", "86992134");
        User user2 = new User(null, "Eliseu Santos", "elispdam.1999@gmail.com", "71 98888-4040", "36250000");


        userRepository.saveAll(Arrays.asList(user1, user2));
        
    }

}