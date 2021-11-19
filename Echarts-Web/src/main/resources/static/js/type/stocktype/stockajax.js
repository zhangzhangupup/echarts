function stockajax(id, url, title) {
    var myChart = echarts.init(document.getElementById(id));
    //数据加载完之前先显示一段简单的loading动画
    myChart.showLoading();
    var stockCaseDate = [];
    var accept = [];
    var standardization = [];
    var deduction = [];
    var review = [];
    var problempiece = [];
    var returns = [];
    $.ajax({
        url: url,
        type: "get",
        dataType: "json",
        success: function (TotalCaseData) {
            var data = TotalCaseData.data;
            for (var i = 0; i < data.length; i++) {
                stockCaseDate.push(data[i].date);
                accept.push(data[i].accept);
                standardization.push(data[i].standardization);
                deduction.push(data[i].deduction);
                review.push(data[i].review);
                problempiece.push(data[i].problempiece);
                returns.push(data[i].returns);
            }
            var seriesdata = [accept, standardization, deduction, review, problempiece, returns];
            var seriesname = ['受理', '标准化', '扣费', '审核', '问题件', '回传'];
            var seriescolor = ["#c6361d", "#a7c61d", "#1dc6a4", "#0f2ecb",
                "#43f303", "#c50fcb"]
            if (data.length == 0) {
                title = '今天没数据'
            }
            var series1 = stockseries(seriesname, seriesdata, seriescolor);
            myChart.hideLoading();    //隐藏加载动画
            myChart.setOption({        //加载数据图表
                title: {
                    text: title,
                    textStyle: {
                        color: '#000000',
                        fontSize: 20,
                    }
                },
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'line'
                    }
                }, toolbox: {
                    top: 20,
                    show: true,
                    feature: {
                        dataZoom: {
                            yAxisIndex: 'none'
                        },
                        dataView: {
                            readOnly: false,
                            optionToContent: HorizontalTableConversion
                        },
                        magicType: {type: ['line', 'bar']},
                        restore: {},
                        saveAsImage: {}
                    }
                },
                legend: {
                    data: seriesname,
                    textStyle: {
                        fontSize: 10
                    },


                }, grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                yAxis: {
                    data: stockCaseDate,
                    axisLabel: {
                        show: true,
                        textStyle: {
                            color: '#2f2a3b',
                        },
                        fontSize: 15,
                    }
                },
                xAxis: {
                    type: 'value',
                    axisLabel: {
                        show: true,
                        textStyle: {
                            color: '#2f2a3b',
                        },
                        fontSize: 15,
                    }
                },
                series: series1
            })
        }
    })
}