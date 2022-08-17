package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.repositories.VisitRepository;
import guru.springframework.sfgpetclinic.services.VisitService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
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

    @Test
    void findAll() {

        Visit visit = new Visit();
        Set<Visit> visits = new HashSet<>();
        visits.add(visit);
        when(visitRepository.findAll()).thenReturn(visits);
        Set<Visit> v = visitSDJpaService.findAll();
        assertThat(v).hasSize(1);
        verify(visitRepository).findAll();
    }

    @Test
    void findById() {
        Visit visit = new Visit();
        when(visitRepository.findById(1l)).thenReturn(Optional.of(visit));
        Visit v = visitSDJpaService.findById(1l);
        assertThat(v).isNotNull();
        verify(visitRepository).findById(1l);
    }

    @Test
    void save() {
        Visit visit = new Visit();
        when(visitRepository.save(any(Visit.class))).thenReturn(visit);
        Visit visit1 = visitRepository.save(visit);
        assertThat(visit1).isNotNull();
        verify(visitRepository).save(visit);
    }
}