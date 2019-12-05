package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.UserlikeExample;
import com.hnu.ccdm.entity.UserlikeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserlikeMapper {
    int countByExample(UserlikeExample example);

    int deleteByExample(UserlikeExample example);

    int deleteByPrimaryKey(UserlikeKey key);

    int insert(UserlikeKey record);

    int insertSelective(UserlikeKey record);

    List<UserlikeKey> selectByExample(UserlikeExample example);

    int updateByExampleSelective(@Param("record") UserlikeKey record, @Param("example") UserlikeExample example);

    int updateByExample(@Param("record") UserlikeKey record, @Param("example") UserlikeExample example);
}