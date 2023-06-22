package in.project.repository;

import java.util.List;

import in.project.model.Post;

public interface SearchRepository {

	List<Post> findByText(String text);
}
