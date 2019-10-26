package rafal.ksiegarnia.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rafal.ksiegarnia.demo.model.Book;

@Repository
public interface BookRespository  extends JpaRepository <Book, Integer>{


}
