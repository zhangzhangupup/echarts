package com.zhang.service;

import com.zhang.pojo.NumberOfProblemPieces;

import java.util.List;

public interface NumberOfProblemPiecesService {
    /**
     * 查询第一天的数据
     */
    List<NumberOfProblemPieces> SelectOneDayNumberOfProblemPieces();

    /**
     * 查询第二天的数据
     */
    List<NumberOfProblemPieces> SelectTwoDayNumberOfProblemPieces();

    /**
     * 查询第三天的数据
     */
    List<NumberOfProblemPieces> SelectThreeDayNumberOfProblemPieces();

    /**
     * 查询第四天的数据
     */
    List<NumberOfProblemPieces> SelectFourDayNumberOfProblemPieces();

    /**
     * 查询第五天的数据
     */
    List<NumberOfProblemPieces> SelectFiveDayNumberOfProblemPieces();

    /**
     * 查询第六天的数据
     */
    List<NumberOfProblemPieces> SelectSixDayNumberOfProblemPieces();

    /**
     * 查询第七天的数据
     */
    List<NumberOfProblemPieces> SelectSevenDayNumberOfProblemPieces();
}
