package com.hnu.ccdm.service;

import com.hnu.ccdm.entity.Post;

import java.util.List;

public interface PostService {
    //新增帖子
    int addPost(Post post);

    //通过id得到帖子
    Post getPostById(String id);

    //帖子列表
    List<Post> getPostList ();

    int deletePostById(String id);
}
