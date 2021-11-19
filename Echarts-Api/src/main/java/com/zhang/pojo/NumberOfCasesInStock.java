package com.zhang.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * NumberOfCasesInStock实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors
public class NumberOfCasesInStock {
    /**
     * 存量案件数表
     * NumberOfCasesInStock日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
    /**
     * NumberOfCasesInStock受理
     */
    private int accept;
    /**
     * NumberOfCasesInStock标准化
     */
    private int standardization;
    /**
     * NumberOfCasesInStock扣费
     */
    private int deduction;
    /**
     * NumberOfCasesInStock审核
     */
    private int review;
    /**
     * NumberOfCasesInStock问题件
     */
    private int problempiece;
    /**
     * NumberOfCasesInStock回传
     */
    private int returns;
}
