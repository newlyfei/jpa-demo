package com.example.jpa.one.repository.domain;
/*
 (1)、@Entity 代表此类映射为数据库的表结构
 (2)、@Table(name="tbl_dept")此注解用于配置实体类与表映射的关系,name代表映射的表名
 (3)、 @Id注解代表此类为一个主键
 (4)、@GeneratedValue注解用于配置主键相关信息,generator属性用于配置生成策略有以下几种枚举值:
 　　1、auto - 主键由程序控制 。
 　　2、IDENTITY - 由数据库自动生成。
 　　3、enerator -指定生成主键使用的生成器 。
 　  4、SEQUENCE - 根据底层数据库的序列来生成主键 。
 　　5、TABLE - 使用一个特定的数据库表来保存主键。
 　　6、system-uuid 代表使用系统生成的uuid进行配。
 (5)、@Column用于配置列相关信息的注解
 　　1、name字段用于指定映射到表结构的映射字段。
 　　2、length代表此字段的长度约束,可以省略。
 　　3、unique属性代表此字段是否开启唯一性约束，默认为false,唯一则为true 。
 　　4、nullable代表此字段是否可以为空,默认为true 。 false代表不能为空 。
 （6）、@DateTimeFormat用于映射数据库表时间的格式。
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

//
@Entity
@Table(name = "data_list")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DataList implements Serializable {
//    @Id
//    @GeneratedValue(generator = "system-uuid")
//    @GenericGenerator(name = "system-uuid",strategy = "uuid")
//    @Column(name = "id",length = 32)
//    private String id;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    /**
     * nullable - 是否可以为空，默认为true
     * unique  - 是否唯一,默认为false
     */
    @Column(name = "username",nullable = false,unique = true)
    private String username;

    @Column(name = "company")
    private String company;
    private String memo;

    private Integer state;

    @Column(name = "addtime")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date addtime;

    private String hjzd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getHjzd() {
        return hjzd;
    }

    public void setHjzd(String hjzd) {
        this.hjzd = hjzd;
    }
}
