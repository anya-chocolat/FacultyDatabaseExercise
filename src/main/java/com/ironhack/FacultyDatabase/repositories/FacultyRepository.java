package com.ironhack.FacultyDatabase.repositories;

import com.ironhack.FacultyDatabase.models.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Integer> {
}
