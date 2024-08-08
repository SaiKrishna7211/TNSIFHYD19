package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.BookEntity;
import repository.BookRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	private BookRepository repo;
	
	@PostMapping("/addBook")
	public String saveBook(@RequestBody BookEntity book) {
		repo.save(book);
		return "book added successfully";
	}
	
	@GetMapping("/findAllBooks")
	public List<BookEntity> getAllBooks(@RequestParam BookEntity book) {
		return repo.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		repo.deleteById(id);
		return "book deleted successfully";
	}
	
}
