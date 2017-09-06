package ch.praesentation.repository;

import ch.praesentation.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Content, Integer> {
}
