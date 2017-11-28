package loga;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Book {
    private String title;
    private String authorName;
    private String publiserName;
    private Integer yearOfPublised;
    private String edition;
    @Column(name = "title", nullable = false, length = 100)
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Column(name = "author_name", nullable = false, length = 100)
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    @Column(name = "publiser_Name", nullable = false, length = 100)
    public String getPubliserName() {
        return publiserName;
    }
    public void setPubliserName(String publiserName) {
        this.publiserName = publiserName;
    }
    @Column(name = "published_year", nullable = false, length = 100)
    public Integer getYearOfPublised() {
        return yearOfPublised;
    }
    public void setYearOfPublised(Integer yearOfPublised) {
        this.yearOfPublised = yearOfPublised;
    }
    @Column(name = "edition", nullable = false, length = 100)
    public String getEdition() {
        return edition;
    }
    public void setEdition(String edition) {
        this.edition = edition;
    }
    
}
