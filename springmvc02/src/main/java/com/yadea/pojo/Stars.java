package com.yadea.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author DongChi
 * @Date 2021.7.14 11:29
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stars {

    private int RankId;      //球星排名
    private String name;     //球星姓名
    private int age;         //球星年龄
    private String advantage;      //优势


}
