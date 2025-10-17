package drucha.dev.website2.repo;

import drucha.dev.website2.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
