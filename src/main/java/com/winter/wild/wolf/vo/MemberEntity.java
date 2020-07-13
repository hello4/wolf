package com.winter.wild.wolf.vo;

import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;

@Data
@Alias("member")
public class MemberEntity {

    private Long id;

    private String email;

    private String password;

    @Builder
    public MemberEntity(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }
}