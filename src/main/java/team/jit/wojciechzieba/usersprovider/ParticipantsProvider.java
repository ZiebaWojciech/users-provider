package team.jit.wojciechzieba.usersprovider;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ParticipantsProvider {
    private final static List<User> USERS =
            List.of(

                    new User("Piotr",
                            "zdrada aka samorozwój",
                            "biały"
                    ),

                    new User("Wojtek",
                            "imprezy integracyjne",
                            "niebieski")
                    ,
                    new User(
                            "Matylda",
                            "ass-kicking",
                            "czarny"
                    ),
                    new User(
                            "Maciej",
                            "absynt",
                            "zielony"
                    ),
                    new User(
                            "Domżi",
                            "klocki lego",
                            "piwny"
                    ),
                    new User(
                            "Muody",
                            "nadgodziny",
                            "tani"
                    )
            );

    @GetMapping("/users")
    List<User> getUsers() {
        return USERS;
    }
}

