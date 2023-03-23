package entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "operator")
public class Operator implements Serializable{


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
        private String turnstle_Area;

        @Column(name = "turnstle_operator")
        private String turnstleOperator;

        @Column(name = "operator_remarks")
        private String operatorRemarks;

        @Column(name = "operator_time")
        private String operatorTime;

    }
