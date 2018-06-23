package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

/**
 * 数字账户 。 网络账户的一种
 */

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table( name = "digital_account")
public class DigitalAccount {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id ;

    @Column
    private String name;  //名称

    @Column
    private String url ; //地址

    @Column( name = "user_name")
    private String username; //用户名

    @Column( name = "password")
    private String password; //密码

    @Column
    private String mark; //备注
}
