package iskon.beans;

import javax.persistence.*;

@Entity
public class vaishnavcalender {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(nullable = false)
    String date;
    @Column(nullable = false,unique = true)
    String fetstivename;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFetstivename() {
        return fetstivename;
    }

    public void setFetstivename(String fetstivename) {
        this.fetstivename = fetstivename;
    }
}
