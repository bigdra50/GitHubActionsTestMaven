import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GitHubActionsTestTest {

    @Test
    void addTest() {
        assertEquals(4, GitHubActionsMaven.add(2, 3));
    }

    @Test
    void mulTest() {
        assertEquals(6, GitHubActionsMaven.mul(2, 3));
    }
}