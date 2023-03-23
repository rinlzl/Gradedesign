package entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "turnstles")
public class Turnstle {
    @GeneratedValue(generator = "JDBC") // 自增的主键映射
    @Id
    @Column(name = "id", insertable = false)
    private Integer id;

    @Column(name = "turnstle_num")
    private String turnstleNum;

    @Column(name = "turnstle_name")
    private String turnstleName;

    @Column(name = "turnstle_pics")
    private String turnstlePics;

    @Column(name = "turnstle_area")
    private String turnstleArea;

    @Column(name = "turnstle_status")
    private String turnstleStatus;

    @Column(name = "turnstle_remarks")
    private String turnstleRemarks;
}
