package com.arbadak.test;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="Role")
public class Role {

@Id
@GeneratedValue
@Column(name="role_id")
    private Long id;
@Column(name="title")

    private String title;

@OneToMany (mappedBy = "role")
    private Set<User> users;


    public Role(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
