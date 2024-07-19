package br.edu.iftm.manytoone.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.edu.iftm.manytoone.domain.Library;

@Repository
public interface LibraryRepository extends CrudRepository<Library, Long> {}
