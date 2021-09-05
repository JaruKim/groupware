package kr.co.mslk.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

/**
 * 사용자
 */
@Entity
@Getter
@Setter
public class User {
    @Id @GeneratedValue
    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "PWD")
    private String pwd;

    @Column(name = "KOR_NM")
    private String korNm;

    @Column(name = "ENG_NM")
    private String engNm;

    @Column(name = "CN_NM")
    private String cnNm;

    @Column(name = "GENDER")
    private char gender;

    @Column(name = "BIRTH")
    private Date birth;

    @Column(name = "EMAIL")
    private String email;

    @ManyToOne
    @JoinColumn(name = "POSITION_ID")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "COM_ID")
    private Company company;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "LOGIN_DATE")
    private Date loginDate;

    @Column(name = "INS_DATE")
    private Date insDate;

    @Column(name = "UPD_DATE")
    private Date updDate;

    @OneToOne
    @JoinColumn(name = "ID")
    private User updUser;

    @Column(name = "DEL_YN")
    private boolean delYn;

    @Column(name = "DEL_DATE")
    private Date delDate;

    @Column(name = "PWD_CHNG_DATE")
    private Date pwdChngDate;

    //TODO: 모든 데이터를 표시
    @Override
    public String toString() {
        return "User{" + 
                "id=" + userId +
                "}";
    }
}
