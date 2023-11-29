package team.jit.wojciechzieba.usersprovider;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ParticipantsProvider {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping("/users")
    List<User> getUsers() {
        if (LocalDateTime.now().getDayOfWeek().getValue() < 5) {
            return usersRepository.getAll();
        } else {
            return List.of();
        }
    }
}

