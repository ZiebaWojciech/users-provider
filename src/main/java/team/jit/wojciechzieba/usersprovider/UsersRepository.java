package team.jit.wojciechzieba.usersprovider;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
class UsersRepository {
    List<User> getAll() {
        return List.of(

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

    }
}
