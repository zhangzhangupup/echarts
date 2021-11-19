function NewAddcasewithAjaxEcharts(id, url, title, value) {
    var NewAddcasewithEcharts = echarts.init(document.getElementById(id));
    NewAddcasewithEcharts.showLoading();
    var NewDate = [];
    var NewProject = [];
    var NewToatal = [];
    $.ajax({
        url: url,
        type: "get",
        dataType: "json",
        success: function (NewCaseData) {
            var data = NewCaseData.data;
            for (var i = 0; i < data.length; i++) {
                NewDate.push(data[i].date);
                NewProject.push(data[i].project);
                NewToatal.push(data[i].newcaseswithdrawn);
            }
            var seriesdata = [NewToatal];

            var seriesname = ['新增撤案数'];
            var seriescolor = ["#1dc6a4"]
            if (data.length == 0) {
                title = '今天没数据'
            }
            var series1 = newaddseriescasewithdrawn(seriesdata, seriesname, seriescolor);
            NewAddcasewithEcharts.hideLoading();
            NewAddcasewithEcharts.setOption({
                title: {
                    text: title,
                    textStyle: {
                        color: '#2f2a3b',
                        fontSize: 20
                    }
                },
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'shadow'
                    }
                },
                legend: {
                    data: seriesname
                },
                xAxis: {
                    data: NewProject,
                    axisLabel: {
                        show: true,
                        textStyle: {
                            color: '#2f2a3b',
                        },
                        interval: 0,
                        rotate: 40
                    }
                }, toolbox: {
                    top: 20,
                    show: true,
                    feature: {
                        dataZoom: {
                            yAxisIndex: 'none'
                        },
                        dataView: {readOnly: false,optionToContent: TableConversion},
                        magicType: {type: ['line', 'bar']},
                        restore: {},
                        saveAsImage: {}
                    }
                },
                yAxis: {
                    type: 'value',
                    axisLabel: {
                        show: true,
                        textStyle: {
                            color: '#2f2a3b',
                            // fontSize: '38',//字体大小
                        },
                    }
                },
                series: series1
            })
            var shift = NewDate.shift();
            Modifyname('withdrawnCasesul', value, shift)
        }
    })
}