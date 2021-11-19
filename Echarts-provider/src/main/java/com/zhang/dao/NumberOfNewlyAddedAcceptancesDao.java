package com.zhang.dao;


import com.zhang.pojo.NumberOfNewlyAddedAcceptances;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface NumberOfNewlyAddedAcceptancesDao {
    /**
     * 查询第一天的数据
     */
    List<NumberOfNewlyAddedAcceptances> SelectOneDayNumberOfNewlyAddedAcceptances();

    /**
     * 查询第二天的数据
     */
    List<NumberOfNewlyAddedAcceptances> SelectTwoDayNumberOfNewlyAddedAcceptances();

    /**
     * 查询第三天的数据
     */
    List<NumberOfNewlyAddedAcceptances> SelectThreeDayNumberOfNewlyAddedAcceptances();

    /**
     * 查询第四天的数据
     */
    List<NumberOfNewlyAddedAcceptances> SelectFourDayNumberOfNewlyAddedAcceptances();

    /**
     * 查询第五天的数据
     */
    List<NumberOfNewlyAddedAcceptances> SelectFiveDayNumberOfNewlyAddedAcceptances();

    /**
     * 查询第六天的数据
     */
    List<NumberOfNewlyAddedAcceptances> SelectSixDayNumberOfNewlyAddedAcceptances();

    /**
     * 查询第七天的数据
     */
    List<NumberOfNewlyAddedAcceptances> SelectSevenDayNumberOfNewlyAddedAcceptances();
}
