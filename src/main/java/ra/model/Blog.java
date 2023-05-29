package ra.model;

import javax.persistence.*;

@Entity
@Table( name = "blog")
public class Blog {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private String content;
    private String title;

    public Blog() {
    }

    public Blog(Long id, String content, String title) {
        this.id = id;
        this.content = content;
        this.title = title;
    }
    @Override
    public String toString() {
        return String.format("Blog[id=%d, content='%s', title='%s']", id, content, title);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
