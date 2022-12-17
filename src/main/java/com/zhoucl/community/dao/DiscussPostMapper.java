package com.zhoucl.community.dao;

import com.zhoucl.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    //如果只有一个参数，且在if中使用，则必须使用别名（param）
    int selectDiscussPostRows(@Param("userId") int userId);
}
