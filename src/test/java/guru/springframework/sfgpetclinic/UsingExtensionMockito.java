package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;
@ExtendWith(MockitoExtension.class)
public class UsingExtensionMockito {

    @Mock
    Map<String, Object> map;
    //Extendwith removes the need for intializing the mocks by calling internally the initMock()
    @Test
    void testExtensionMock(){
        map.put("Hi","Ab");
    }
}
