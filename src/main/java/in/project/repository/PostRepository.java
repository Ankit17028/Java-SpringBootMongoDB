package in.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.project.model.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
