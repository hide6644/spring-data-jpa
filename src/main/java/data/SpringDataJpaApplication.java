package data;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@AllArgsConstructor
@Log4j2
public class SpringDataJpaApplication {

    UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

    @Bean
    ApplicationRunner runUserService() {
        return args -> {
            userService.getAll().forEach(user -> log.info("User name: {}", user.getUsername()));
        };
    }
}
