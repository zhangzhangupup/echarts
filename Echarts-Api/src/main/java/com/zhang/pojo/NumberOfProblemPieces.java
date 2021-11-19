package com.zhang.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * 问题件数量表
 * NumberOfProblemPieces
 */
import java.util.Date;

@Data
@Accessors
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NumberOfProblemPieces {
    /**
     * NumberOfProblemPieces日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
    /**
     * NumberOfProblemPieces项目
     */
    private String project;
    /**
     * NumberOfProblemPieces新发问题件数
     */
    private int newproblempieces;
    /**
     * NumberOfProblemPieces当天回销问题件数
     */
    private int sellbackproblem;
}
