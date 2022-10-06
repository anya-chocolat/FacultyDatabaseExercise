package com.ironhack.FacultyDatabase;

import com.ironhack.FacultyDatabase.models.Faculty;
import com.ironhack.FacultyDatabase.models.Office;
import com.ironhack.FacultyDatabase.repositories.FacultyRepository;
import com.ironhack.FacultyDatabase.repositories.OfficeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.AutoConfigureGraphQl;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class FacultyTests {

    @Autowired
    FacultyRepository facultyRepository;

    @Autowired
    OfficeRepository officeRepository;

    @Test
    void getOfficeFromFaculty(){
        Office office = officeRepository.save(new Office(1, "2A"));
        Faculty faculty = facultyRepository.save(new Faculty("Facu", "Lty", "Dep", true, office));
        Optional<Faculty> facultyOptional = facultyRepository.findById(faculty.getId());
        assertTrue(facultyOptional.isPresent());
        assertEquals(1, facultyOptional.get().getOffice().getRoom_number());
    }

    @Test
    void findOfficeByFacultyLastName(){
        Office office = officeRepository.save(new Office(1, "2A"));
        Faculty faculty = facultyRepository.save(new Faculty("Facu", "Lty", "Dep", true, office));
        Optional<Office> officeOptional = officeRepository.findByFacultyLastName("Lty");
        assertTrue(officeOptional.isPresent());
    }
}
