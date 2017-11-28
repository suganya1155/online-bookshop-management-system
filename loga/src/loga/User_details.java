package loga;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class User_details {
    private String firstName;
    private String  lastname;
    private String middleName;
    private String dateOfBirth;
    private String profession;
    private String city;
    private Address address;
    private Book book;
    @Column(name = "first_name", nullable = false, length = 100)
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Column(name = "last_name", nullable = false, length = 100)
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    @Column(name = "middle_name", nullable = false, length = 100)
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    @Column(name = "dob", nullable = false, length = 100)
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    @Column(name = "profession", nullable = false, length = 100)
    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
    @Column(name = "city", nullable = false, length = 100)
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    @Column(name = "address", nullable = false, length = 100)
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    @Column(name = "book", nullable = false, length = 100)
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }

}
