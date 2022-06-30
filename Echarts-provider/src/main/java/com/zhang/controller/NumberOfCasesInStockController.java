package com.zhang.controller;

import com.zhang.Result.Result;
import com.zhang.Result.StatusCode;
import com.zhang.service.NumberOfCasesInStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Transactional
@CrossOrigin
@RestController
@RequestMapping("/numberOfCasesInStock")
public class NumberOfCasesInStockController {
    @Autowired
    private NumberOfCasesInStockService numberOfCasesInStockService;

    /**
     * test环境
     * @return
     */
    @GetMapping("/SelectWeekNumberOfCasesInStockDao")
    public Result SelectWeekNumberOfCasesInStockDao(){
        return new Result(true, StatusCode.OK,"查询成功",numberOfCasesInStockService.SelectWeekNumberOfCasesInStock());
    }
}
