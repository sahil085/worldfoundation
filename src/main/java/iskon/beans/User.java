package iskon.beans;


import javax.persistence.*;

@Entity
@Table(name = "Userdatatable")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column( length = 100, nullable = false)

    private String firstname;
    @Column( length = 100, nullable = false)

    private String lastname;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Column( length = 100, nullable = false, unique = true)

    private String fullname;
    @Column( length = 100, nullable = false, unique = true)
    private String email;

    @Column( length = 100, nullable = false)
    private String password;
    @Lob
    private byte[] photo;
    @Column( length = 15, nullable = false, unique = true)
    private long contactnumber;
    @Column( length =150, nullable = false)
    private String address;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public long getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(long contactnumber) {
        this.contactnumber = contactnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
