package com.letpep.common.model;


import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class ValiParam {
    @NotEmpty(message = "姓名不能为空")
    private String name;

    @NotBlank(message = "分数不能为空")
    @Max(value =200,message ="分数太高了")
    private Integer score;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }



}
