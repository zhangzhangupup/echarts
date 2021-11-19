package com.zhang.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 总量案件数表
 * TotalNumberOfCases实体类
 */
@Data
@Accessors
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TotalNumberOfCases {
    /**
     * TotalNumberOfCases日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
    /**
     * TotalNumberOfCases日期
     */
    private String project;
    /**
     * TotalNumberOfCases总案件数
     */
    private int totalcases;
    /**
     * TotalNumberOfCases库存数
     */
    private int inventory;
    /**
     * TotalNumberOfCasesYSJ审核中
     */
    private int ysjunderreview;
    /**
     * TotalNumberOfCases保司处理中
     */
    private int baojiprocessing;
}
