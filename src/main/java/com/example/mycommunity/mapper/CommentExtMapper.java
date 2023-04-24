package com.example.mycommunity.mapper;

import com.example.mycommunity.model.Comment;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}