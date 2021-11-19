function ProblemCasesitemsEchartsajax(id, url, title, value) {
    var ProblemCasesitemsEcharts = echarts.init(document.getElementById(id));

    ProblemCasesitemsEcharts.showLoading();

    var NewDate = [];
    var NewProject = [];
    var newproblempieces = [];
    var sellbackproblem = [];

    $.ajax({
        url: url,
        type: "get",
        dataType: "json",
        success: function (NewCaseData) {
            var data = NewCaseData.data;
            for (var i = 0; i < data.length; i++) {
                NewDate.push(data[i].date);
                NewProject.push(data[i].project);
                newproblempieces.push(data[i].newproblempieces);
                sellbackproblem.push(data[i].sellbackproblem);
            }
            var seriesdata = [newproblempieces, sellbackproblem];

            var seriesname = ['新发现问题件数', '当天回销问题件数'];
            var seriescolor = ["#1dc6a4"]
            if (data.length == 0) {
                title = '今天没数据'
            }
            var series1 = Problemseries(seriesdata, seriesname, seriescolor);
            ProblemCasesitemsEcharts.hideLoading();
            ProblemCasesitemsEcharts.setOption({
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
                        dataView: {
                            readOnly: false,
                            optionToContent: TableConversion
                        },
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
                        },

                    }
                },
                series: series1
            })
            var shift = NewDate.shift();
            Modifyname('ProblemCasesul', value, shift)
        }
    })
}