package entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "users")
public class Users implements Serializable {
    @GeneratedValue(generator = "JDBC") // 自增的主键映射
    @Id
    @Column(name = "id", insertable = false)
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "user_realname")
    private String userRealname;

    @Column(name = "user_gentle")
    private String userGentle;

    @Column(name = "user_tele")
    private String userTele;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_identity")
    private String userIdentity;

    @Column(name = "user_pics")
    private String userPics;
}
