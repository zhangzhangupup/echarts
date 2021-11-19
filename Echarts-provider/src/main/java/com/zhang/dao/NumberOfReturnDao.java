package com.zhang.dao;

import com.zhang.pojo.NumberOfReturn;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface NumberOfReturnDao {
    /**
     * 查询第一天的数据
     */
    List<NumberOfReturn> SelectOneDayNumberOfReturn();

    /**
     * 查询第二天的数据
     */
    List<NumberOfReturn> SelectTwoDayNumberOfReturn();

    /**
     * 查询第三天的数据
     */
    List<NumberOfReturn> SelectThreeDayNumberOfReturn();

    /**
     * 查询第四天的数据
     */
    List<NumberOfReturn> SelectFourDayNumberOfReturn();

    /**
     * 查询第五天的数据
     */
    List<NumberOfReturn> SelectFiveDayNumberOfReturn();

    /**
     * 查询第六天的数据
     */
    List<NumberOfReturn> SelectSixDayNumberOfReturn();

    /**
     * 查询第七天的数据
     */
    List<NumberOfReturn> SelectSevenDayNumberOfReturn();
}
