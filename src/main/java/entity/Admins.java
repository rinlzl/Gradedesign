package entity;

import lombok.Data;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name="admins")
@Data
public class Admins implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id", insertable = false)
    private Integer id;

    @Column(name = "admin_username")
    private String username;

    @Column(name = "admin_password")
    private String password;

}
