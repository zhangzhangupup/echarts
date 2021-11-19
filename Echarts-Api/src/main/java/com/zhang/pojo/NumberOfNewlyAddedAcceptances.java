package com.zhang.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * 新增受理数表
 * NumberOfNewlyAddedAcceptances实体类
 */
import java.util.Date;

@Data
@Accessors
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NumberOfNewlyAddedAcceptances {
    /**
     * 新增受理数表
     * NumberOfNewlyAddedAcceptances日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
    /**
     * NumberOfNewlyAddedAcceptances项目
     */
    private String project;
    /**
     * NumberOfNewlyAddedAcceptances新增受理
     */
    private int newaddacceptances;
}
