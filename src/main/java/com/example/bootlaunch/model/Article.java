package com.example.bootlaunch.model;


import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data //lombok插件自根据成员变量生成get和set方法、toString方法
@AllArgsConstructor //在编译期自动生成：全参构造函数
@NoArgsConstructor
@Builder
@JsonPropertyOrder(value={"content","title"})
public class Article {

    @JsonIgnore
    private Long id;

    //@JsonProperty("auther")
    private String author;
    private String title;
    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    private List<Reader> reader;

}
