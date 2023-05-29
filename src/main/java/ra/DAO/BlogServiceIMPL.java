package ra.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.model.Blog;
import ra.repository.IBlogRepository;
import ra.service.IBlogService;

import java.util.List;
@Service

public class BlogServiceIMPL implements IBlogService {
@Autowired
private IBlogRepository iBlogRepository;
    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return iBlogRepository.findById(id);
    }

    @Override
    public void save(Blog blog) {
iBlogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
iBlogRepository.remove(id);
    }
}
