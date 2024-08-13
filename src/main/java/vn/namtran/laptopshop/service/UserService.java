package vn.namtran.laptopshop.service;

import org.springframework.stereotype.Service;

import vn.namtran.laptopshop.domain.User;
import vn.namtran.laptopshop.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User handleSaveUser(User user) {
        User nam = this.userRepository.save(user);
        System.out.println(nam);
        return nam;
    }
}
