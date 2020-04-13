package in.cddu.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.cddu.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
