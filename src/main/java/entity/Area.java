package entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Data
@Table(name = "area")
public class Area implements Serializable {
    @GeneratedValue(generator = "JDBC")
    @Id
    @Column(name = "id", insertable = false)
    private Integer id;

    @Column(name = "area_name")
    private String areaName;
}
