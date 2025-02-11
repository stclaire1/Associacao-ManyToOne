package br.edu.iftm.manytoone.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.edu.iftm.manytoone.domain.Book;

//a notação aqui faz o laço com o @autowired na main, indicando que a dependência pode ser injetada lá
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {}
