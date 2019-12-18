package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.Hotsearch;
import com.hnu.ccdm.entity.HotsearchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotsearchMapper {
    int countByExample(HotsearchExample example);

    int deleteByExample(HotsearchExample example);

    int deleteByPrimaryKey(String hotsearchid);

    int insert(Hotsearch record);

    int insertSelective(Hotsearch record);

    List<Hotsearch> selectByExample(HotsearchExample example);

    Hotsearch selectByPrimaryKey(String hotsearchid);

    int updateByExampleSelective(@Param("record") Hotsearch record, @Param("example") HotsearchExample example);

    int updateByExample(@Param("record") Hotsearch record, @Param("example") HotsearchExample example);

    int updateByPrimaryKeySelective(Hotsearch record);

    int updateByPrimaryKey(Hotsearch record);
}