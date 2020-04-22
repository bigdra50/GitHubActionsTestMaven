import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GitHubActionsTestTest {

    @Test
    void add() {
        assertEquals(5, GitHubActionsTest.add(2, 3));
    }

    @Test
    void mul() {
        assertEquals(6, GitHubActionsTest.mul(2, 3));
    }
}