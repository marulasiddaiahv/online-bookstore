package in.cddu.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.cddu.onlinebookstore.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel = "bookcategory", path="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
