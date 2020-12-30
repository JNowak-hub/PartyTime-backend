package pl.sdacademy.projectbackend.spock

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import pl.sdacademy.projectbackend.service.UserService
import spock.lang.Specification

@SpringBootTest
@ActiveProfiles("test")
class LoadContextTest extends Specification{

    @Autowired
    private UserService userService;

    def "when context is loaded then all expected beans are created"() {
        expect: "the WebController is created"
        userService
    }
}
