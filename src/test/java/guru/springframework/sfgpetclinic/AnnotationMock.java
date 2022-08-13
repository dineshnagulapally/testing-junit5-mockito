package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Map;

public class AnnotationMock {

    @Mock
    Map<String,Object> map;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
//        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testMockAnnotate(){
        map.put("Hi","Joe");
    }
}
