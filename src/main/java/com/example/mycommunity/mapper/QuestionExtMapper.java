package com.example.mycommunity.mapper;

import com.example.mycommunity.dto.QuestionQueryDTO;
import com.example.mycommunity.model.Question;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface QuestionExtMapper {
    int incView(Question record);

    int incCommentCount(Question record);

    List<Question> selectRelated(Question question);

    Integer countBySearch(QuestionQueryDTO questionQueryDTO);

    List<Question> selectBySearch(QuestionQueryDTO questionQueryDTO);

    List<Question> selectSticky();
}