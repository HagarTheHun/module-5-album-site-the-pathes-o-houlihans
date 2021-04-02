package org.wcci.apimastery.Service;

import org.springframework.data.repository.CrudRepository;
import org.wcci.apimastery.Entities.Comment;

public interface CommentRepository extends CrudRepository<Comment,Long> {
}
