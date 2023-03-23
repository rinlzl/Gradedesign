package entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "registers")
public class Registers implements Serializable {
    @GeneratedValue(generator = "JDBC") // 自增的主键映射
    @Id
    @Column(name = "id", insertable = false)
    private Integer id;

    @Column(name = "turnstle_id")
    private Integer turnstleId;

    @Column(name = "turnstle_num")
    private String turnstleNum;

    @Column(name = "turnstle_name")
    private String turnstleName;

    @Column(name = "turnstle_pics")
    private String turnstlePics;

    @Column(name = "turnstle_area")
    private String turnstleArea;

    @Column(name = "turnstle_register")
    private String turnstleRegister;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "username")
    private String username;

    @Column(name = "user_realname")
    private String userRealname;

    @Column(name = "user_tele")
    private String userTele;

    @Column(name = "user_pics")
    private String userPics;

    @Column(name = "register_remarks")
    private String registerRemarks;

    @Column(name = "register_time")
    private String registerTime;

}
