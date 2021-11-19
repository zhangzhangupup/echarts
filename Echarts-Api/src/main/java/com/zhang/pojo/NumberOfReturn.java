package com.zhang.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * NumberOfReturn实体类
 * 回传数量表
 */
@Data
@Accessors
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NumberOfReturn {
    /**
     * NumberOfReturn日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
    /**
     * NumberOfReturn项目
     */
    private String project;
    /**
     * NumberOfReturn新进回传数
     */
    private int newcomingreturn;
    /**
     * NumberOfReturn当天回传成功数
     */
    private int successfulreturn;
    /**
     * NumberOfReturn当天回传失败数
     */
    private int failedreturn;
    /**
     * NumberOfReturn当天回传阶段总数
     */
    private int totalreturn;
}
