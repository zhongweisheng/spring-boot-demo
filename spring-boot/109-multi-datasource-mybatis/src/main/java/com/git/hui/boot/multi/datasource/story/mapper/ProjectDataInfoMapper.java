package com.git.hui.boot.multi.datasource.story.mapper;

import com.git.hui.boot.multi.datasource.story.entity.ProjectDataInfo;
import com.git.hui.boot.multi.datasource.story.entity.ProjectDataInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectDataInfoMapper {
    long countByExample(ProjectDataInfoExample example);

    int deleteByExample(ProjectDataInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProjectDataInfo record);

    int insertSelective(ProjectDataInfo record);

    List<ProjectDataInfo> selectByExample(ProjectDataInfoExample example);

    ProjectDataInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProjectDataInfo record, @Param("example") ProjectDataInfoExample example);

    int updateByExample(@Param("record") ProjectDataInfo record, @Param("example") ProjectDataInfoExample example);

    int updateByPrimaryKeySelective(ProjectDataInfo record);

    int updateByPrimaryKey(ProjectDataInfo record);
}