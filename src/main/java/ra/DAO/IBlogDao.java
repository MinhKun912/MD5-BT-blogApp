package ra.DAO;

import ra.model.Blog;

import java.util.List;

public interface IBlogDao {
    List<Blog> findAll();

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);
}
