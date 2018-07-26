package com.chinese.sici.server.mapper;

import com.chinese.sici.server.model.TbAuthorInfo;
import com.chinese.sici.server.model.TbAuthorInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAuthorInfoMapper {
    long countByExample(TbAuthorInfoExample example);

    int deleteByExample(TbAuthorInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAuthorInfo record);

    int insertSelective(TbAuthorInfo record);

    List<TbAuthorInfo> selectByExampleWithBLOBs(TbAuthorInfoExample example);

    List<TbAuthorInfo> selectByExample(TbAuthorInfoExample example);

    TbAuthorInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAuthorInfo record, @Param("example") TbAuthorInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") TbAuthorInfo record, @Param("example") TbAuthorInfoExample example);

    int updateByExample(@Param("record") TbAuthorInfo record, @Param("example") TbAuthorInfoExample example);

    int updateByPrimaryKeySelective(TbAuthorInfo record);

    int updateByPrimaryKeyWithBLOBs(TbAuthorInfo record);

    int updateByPrimaryKey(TbAuthorInfo record);
}