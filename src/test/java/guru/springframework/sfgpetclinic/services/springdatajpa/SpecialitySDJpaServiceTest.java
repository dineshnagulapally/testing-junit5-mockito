package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.repositories.SpecialtyRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.internal.verification.AtLeast;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class SpecialitySDJpaServiceTest {

    @Mock
    SpecialtyRepository specialtyRepository;

    @InjectMocks
    SpecialitySDJpaService specialitySDJpaService;
    //InjectMocks will inject the repository mock to service class and create an instance for it
    @Test
    void delete() {
        specialitySDJpaService.delete(new Speciality());

    }

    @Test
    void deleteById() {
        specialitySDJpaService.deleteById(1l);
        verify(specialtyRepository).deleteById(1l);
    }
    @Test
    void deleteByIdAtLeastOnce() {
        specialitySDJpaService.deleteById(1l);
        specialitySDJpaService.deleteById(1l);
        verify(specialtyRepository, atLeastOnce()).deleteById(1l);
    }

    @Test
    void deleteByIdAtMostOnce() {
        specialitySDJpaService.deleteById(1l);
        verify(specialtyRepository, atMostOnce()).deleteById(1l);
    }

    @Test
    void deleteByIdNeverCalled() {
        specialitySDJpaService.deleteById(1l);
        verify(specialtyRepository).deleteById(1l);
        verify(specialtyRepository, never()).deleteById(5l);
    }
}