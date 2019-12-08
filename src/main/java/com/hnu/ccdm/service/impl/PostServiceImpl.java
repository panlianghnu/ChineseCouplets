package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.entity.Post;
import com.hnu.ccdm.entity.PostExample;
import com.hnu.ccdm.mapper.PostMapper;
import com.hnu.ccdm.service.PostService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostMapper postMapper;

    @Override
    public int addPost(Post post) {
        return postMapper.insert(post);
    }

    @Override
    public Post getPostById(String id) {
        return postMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Post> getPostList() {
        return postMapper.selectByExampleWithBLOBs(new PostExample());
    }

    @Override
    public int deletePostById(String id) {
        return postMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int viewNumAutoIncrease(String id) {
        Post post = postMapper.selectByPrimaryKey(id);
        post.setPostViewnum(post.getPostViewnum()+1);
        return postMapper.updateByPrimaryKey(post);
    }

    @Override
    public int rSumAutoIncrease(String id) {
        Post post = postMapper.selectByPrimaryKey(id);
        post.setPostRsum(post.getPostRsum()+1);
        return postMapper.updateByPrimaryKey(post);
    }

    @Override
    public int rSumAutoDecrease(String id) {
        Post post = postMapper.selectByPrimaryKey(id);
        post.setPostRsum(post.getPostRsum()-1);
        return postMapper.updateByPrimaryKey(post);
    }

    @Override
    public int pSumAutoIncrease(String id) {
        Post post = postMapper.selectByPrimaryKey(id);
        post.setPostPsum(post.getPostPsum()+1);
        return postMapper.updateByPrimaryKey(post);
    }

    @Override
    public int pSumAutoDecrease(String id) {
        Post post = postMapper.selectByPrimaryKey(id);
        post.setPostPsum(post.getPostPsum()-1);
        return postMapper.updateByPrimaryKey(post);
    }
}
