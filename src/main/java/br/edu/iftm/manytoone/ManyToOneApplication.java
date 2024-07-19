package br.edu.iftm.manytoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.iftm.manytoone.domain.Book;
import br.edu.iftm.manytoone.domain.Library;
import br.edu.iftm.manytoone.repository.BookRepository;
import br.edu.iftm.manytoone.repository.LibraryRepository;

@SpringBootApplication
public class ManyToOneApplication implements CommandLineRunner {
	//indica injeção de dependencias
	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private LibraryRepository libraryRepository;

	public static void main(String[] args) {
		SpringApplication.run(ManyToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// criando uma biblioteca
		Library lib = new Library();
		lib.setName("IFTM");

		//criando livros
		//varios livros podem ser ligados a uma biblioteca, por isso @manytoone
		Book book1 = new Book();
		book1.setName("Java");
		book1.setLibrary(lib);

		Book book2 = new Book();
		book2.setName("Spring");
		book2.setLibrary(lib);

		//salvando a biblioteca e os livros
		libraryRepository.save(lib);
		bookRepository.save(book1);
		bookRepository.save(book2);

		//buscando todos os livros
		System.out.println("\n------------------------------\nlivros");
		Iterable<Book> books = bookRepository.findAll();
		books.forEach(book -> {
			System.out.println(book.getName() + " da biblioteca " + book.getLibrary().getName());
		});
		System.out.println("\n------------------------------");
	}

}
