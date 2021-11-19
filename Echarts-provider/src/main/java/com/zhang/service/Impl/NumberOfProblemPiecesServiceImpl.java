package com.zhang.service.Impl;

import com.zhang.dao.NumberOfProblemPiecesDao;
import com.zhang.pojo.NumberOfProblemPieces;
import com.zhang.service.NumberOfProblemPiecesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NumberOfProblemPiecesServiceImpl implements NumberOfProblemPiecesService {
    @Autowired
    private NumberOfProblemPiecesDao numberOfProblemPiecesDao;
    @Override
    public List<NumberOfProblemPieces> SelectOneDayNumberOfProblemPieces() {
        return numberOfProblemPiecesDao.SelectOneDayNumberOfProblemPieces();
    }

    @Override
    public List<NumberOfProblemPieces> SelectTwoDayNumberOfProblemPieces() {
        return numberOfProblemPiecesDao.SelectTwoDayNumberOfProblemPieces();
    }

    @Override
    public List<NumberOfProblemPieces> SelectThreeDayNumberOfProblemPieces() {
        return numberOfProblemPiecesDao.SelectThreeDayNumberOfProblemPieces();
    }

    @Override
    public List<NumberOfProblemPieces> SelectFourDayNumberOfProblemPieces() {
        return numberOfProblemPiecesDao.SelectFourDayNumberOfProblemPieces();
    }

    @Override
    public List<NumberOfProblemPieces> SelectFiveDayNumberOfProblemPieces() {
        return numberOfProblemPiecesDao.SelectFiveDayNumberOfProblemPieces();
    }

    @Override
    public List<NumberOfProblemPieces> SelectSixDayNumberOfProblemPieces() {
        return numberOfProblemPiecesDao.SelectSixDayNumberOfProblemPieces();
    }

    @Override
    public List<NumberOfProblemPieces> SelectSevenDayNumberOfProblemPieces() {
        return numberOfProblemPiecesDao.SelectSevenDayNumberOfProblemPieces();
    }
}
