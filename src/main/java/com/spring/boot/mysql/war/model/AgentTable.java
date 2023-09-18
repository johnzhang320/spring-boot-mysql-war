package com.spring.boot.mysql.war.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

//import org.hibernate.annotations.GenericGenerator;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
/**
 * AgentTable entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "agent_table")

public class AgentTable {

    // Fields
    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "agentId", unique = true, nullable = false)
    private Integer agentId;

    @Column(name = "user_name", unique = true, nullable = false)
    private String userName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email_address", unique = true)
    private String emailAddress;

    @Column(name = "credit_number", unique = true)
    private String creditNumber;

    @Column(name = "credit_holder_name")
    private String cardHolderName;

    private String expiringDate;

    private String securityCode;

    @Column(name = "social_security", unique = true)
    private String socialSecurity;

    @Column(name = "full_name", unique = true)
    private String fullName;

}