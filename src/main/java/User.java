import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Columns;
import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="U0")
public class User implements Serializable {
@Id
@Column(name="id")
@GeneratedValue
    private long id;

@Column(name="age", nullable = false)
    private int age;

@Column(name="first_name", nullable = false)
    private String firstname;

@Column(name="lastname")
    private String lastname;


    public User(){

    }

    public User (long id){
        this.id=id;

    }




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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




}
