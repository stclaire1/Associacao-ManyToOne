package iftm.edu.br.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import iftm.edu.br.biblioteca.domain.Library;

@Repository
public interface LibraryRepository extends CrudRepository<Library, Long> {}
