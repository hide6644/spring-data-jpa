package data;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {

    private final AppUserRepository userRepository;

    @Transactional
    public List<AppUser> getAll() {
        return userRepository.findAll();
    }
}
