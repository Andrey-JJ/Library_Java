package ru.project.library_web.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.project.library_web.models.*;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
}
