package com.mini2S.model.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@Entity
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROLE_SEQ")
    private Long roleSeq;

    @Column(columnDefinition = "varchar(20) not null comment '권한 정보'")
    private String roleName;

    @Builder
    public Roles(Long roleSeq, String roleName) {
        this.roleSeq = roleSeq;
        this.roleName = roleName;
    }
}