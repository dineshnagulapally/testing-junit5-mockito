package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class InlineMock {


    @Test
    @DisplayName("first Mock")
    void testInlineMock() {
        Map mapMock = mock(Map.class);
        assertEquals(0,mapMock.size());

    }
}
