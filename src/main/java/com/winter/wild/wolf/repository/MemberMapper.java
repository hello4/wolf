package com.winter.wild.wolf.repository;

import com.winter.wild.wolf.vo.MemberEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    MemberEntity findByEmail(String userEmail);
    void save(MemberEntity memberEntity);
}
