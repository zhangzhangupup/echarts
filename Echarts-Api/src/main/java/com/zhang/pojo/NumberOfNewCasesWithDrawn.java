package com.zhang.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 新增撤案数表
 * NumberOfNewCasesWithDrawn实体类
 */
@Data
@Accessors
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NumberOfNewCasesWithDrawn {
    /**
     * NumberOfNewCasesWithDrawn日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
    /**
     * NumberOfNewCasesWithDrawn项目
     */
    private String project;
    /**
     * NumberOfNewCasesWithDrawn新增撤案数
     */
    private int newcaseswithdrawn;
}
