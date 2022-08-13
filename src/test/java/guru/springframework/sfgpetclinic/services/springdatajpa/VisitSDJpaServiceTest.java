package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.repositories.VisitRepository;
import guru.springframework.sfgpetclinic.services.VisitService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class VisitSDJpaServiceTest {

    @Mock
    VisitRepository visitRepository;
    @InjectMocks
    VisitSDJpaService visitSDJpaService;
    @Test
    void delete() {
        visitSDJpaService.delete(new Visit());
        verify(visitRepository).delete(any(Visit.class));
    }

    @Test
    void deleteById() {

        visitSDJpaService.deleteById(1L);
        verify(visitRepository).deleteById(1L);
    }
}