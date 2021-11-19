package com.zhang.controller;

import com.zhang.Result.Result;
import com.zhang.Result.StatusCode;
import com.zhang.service.NumberOfProblemPiecesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Transactional
@CrossOrigin
@RestController
@RequestMapping("/NumberOfProblemPieces")
public class NumberOfProblemPiecesController {
    @Autowired
    private NumberOfProblemPiecesService numberOfProblemPiecesService;

    @GetMapping("/SelectOneDayNumberOfProblemPieces")
    public Result SelectOneDayNumberOfProblemPieces() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfProblemPiecesService.SelectOneDayNumberOfProblemPieces());
    }

    @GetMapping("/SelectTwoDayNumberOfProblemPieces")
    public Result SelectTwoDayNumberOfProblemPieces() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfProblemPiecesService.SelectTwoDayNumberOfProblemPieces());
    }

    @GetMapping("/SelectThreeDayNumberOfProblemPieces")
    public Result SelectThreeDayNumberOfProblemPieces() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfProblemPiecesService.SelectThreeDayNumberOfProblemPieces());

    }

    @GetMapping("/SelectFourDayNumberOfProblemPieces")
    public Result SelectFourDayNumberOfProblemPieces() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfProblemPiecesService.SelectFourDayNumberOfProblemPieces());
    }

    @GetMapping("/SelectFiveDayNumberOfProblemPieces")
    public Result SelectFiveDayNumberOfProblemPieces() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfProblemPiecesService.SelectFiveDayNumberOfProblemPieces());
    }

    @GetMapping("/SelectSixDayNumberOfProblemPieces")
    public Result SelectSixDayNumberOfProblemPieces() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfProblemPiecesService.SelectSixDayNumberOfProblemPieces());
    }

    @GetMapping("/SelectSevenDayNumberOfProblemPieces")
    public Result SelectSevenDayNumberOfProblemPieces() {
        return new Result(true, StatusCode.OK, "查询成功", numberOfProblemPiecesService.SelectSevenDayNumberOfProblemPieces());
    }
}
