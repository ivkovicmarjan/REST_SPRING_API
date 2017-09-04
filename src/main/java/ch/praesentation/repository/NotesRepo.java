package ch.praesentation.repository;

import ch.praesentation.model.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepo extends JpaRepository<Notes, Integer> {
}
