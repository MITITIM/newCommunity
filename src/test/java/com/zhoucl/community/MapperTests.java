package com.zhoucl.community;

import com.zhoucl.community.dao.DiscussPostMapper;
import com.zhoucl.community.dao.UserMapper;
import com.zhoucl.community.entity.DiscussPost;
import com.zhoucl.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void SelectUser(){
        User user = userMapper.selectById(101);
        System.out.println(user);
    }

    @Test
    public void SelectDiscussPosts(){
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(0, 0, 10);
        for (DiscussPost discussPost : discussPosts){
            System.out.println(discussPost);
        }
    }
}
