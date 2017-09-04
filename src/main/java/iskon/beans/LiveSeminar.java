package iskon.beans;

import javax.persistence.*;

@Entity
public class LiveSeminar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    int similarity;
    @Column(unique = true)
    String Qtn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSimilarity() {
        return similarity;
    }

    public void setSimilarity(int similarity) {
        this.similarity = similarity;
    }

    public String getQtn() {
        return Qtn;
    }

    public void setQtn(String qtn) {
        Qtn = qtn;
    }
}
