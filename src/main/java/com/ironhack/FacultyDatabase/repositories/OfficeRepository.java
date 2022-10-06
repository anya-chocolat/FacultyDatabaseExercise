package com.ironhack.FacultyDatabase.repositories;

import com.ironhack.FacultyDatabase.models.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OfficeRepository extends JpaRepository<Office, Integer> {

    @Query("SELECT o FROM Office o JOIN Faculty ON Faculty.potato_id = o.id WHERE Faculty.last_name = :lastName")
    Optional<Office> findByFacultyLastName(String lastName);
}
