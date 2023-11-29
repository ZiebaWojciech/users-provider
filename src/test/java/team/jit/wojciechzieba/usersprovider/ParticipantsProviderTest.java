package team.jit.wojciechzieba.usersprovider;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ParticipantsProvider.class)
class ParticipantsProviderTest {

    // mvn test-compile org.pitest:pitest-maven:mutationCoverage

    @MockBean
    private ParticipantsProvider participantsProvider;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getUsers_ReturnsListOfUsers() throws Exception {
        // Mock data
        List<User> mockUsers = List.of(
                new User("TestUser1", "TestInterest1", "TestColor1"),
                new User("TestUser2", "TestInterest2", "TestColor2")
        );

        // Mock the behavior of the ParticipantsProvider class
        when(participantsProvider.getUsers()).thenReturn(mockUsers);

        // Perform GET request and assert the response
        mockMvc.perform(get("/users"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("TestUser1"))
                .andExpect(jsonPath("$[0].hobby").value("TestInterest1"))
                .andExpect(jsonPath("$[0].favouriteColour").value("TestColor1"))
                .andExpect(jsonPath("$[1].name").value("TestUser2"))
                .andExpect(jsonPath("$[1].hobby").value("TestInterest2"))
                .andExpect(jsonPath("$[1].favouriteColour").value("TestColor2"));
    }
}
