package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.Lasthotsearch;
import com.hnu.ccdm.entity.LasthotsearchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LasthotsearchMapper {
    int countByExample(LasthotsearchExample example);

    int deleteByExample(LasthotsearchExample example);

    int deleteByPrimaryKey(String lasthotsearchid);

    int insert(Lasthotsearch record);

    int insertSelective(Lasthotsearch record);

    List<Lasthotsearch> selectByExample(LasthotsearchExample example);

    Lasthotsearch selectByPrimaryKey(String lasthotsearchid);

    int updateByExampleSelective(@Param("record") Lasthotsearch record, @Param("example") LasthotsearchExample example);

    int updateByExample(@Param("record") Lasthotsearch record, @Param("example") LasthotsearchExample example);

    int updateByPrimaryKeySelective(Lasthotsearch record);

    int updateByPrimaryKey(Lasthotsearch record);
}