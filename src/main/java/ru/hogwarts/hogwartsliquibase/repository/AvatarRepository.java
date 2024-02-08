package ru.hogwarts.hogwartsliquibase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.hogwartsliquibase.model.Avatar;

import java.util.Optional;

public interface AvatarRepository extends JpaRepository<Avatar, Long> {

    Optional<Avatar> findByStudentId(Long studentId);
}