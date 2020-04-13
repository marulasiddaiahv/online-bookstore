package in.cddu.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.cddu.onlinebookstore.entity.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
