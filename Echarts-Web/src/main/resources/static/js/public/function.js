//去重
function removeDuplicatedItem(ar) {
    var ret = [];

    for (var i = 0, j = ar.length; i < j; i++) {
        if (ret.indexOf(ar[i]) === -1) {
            ret.push(ar[i]);
        }
    }
    return ret;
}

//把一个大数组分成长度一样的小数组
function group(array, subGroupLength) {
    let index = 0;
    let newArray = [];
    while (index < array.length) {
        newArray.push(array.slice(index, index += subGroupLength));
    }
    return newArray;
}

//修改divname
function Modifyname(id, value, name) {
    var obj = document.getElementById(id).getElementsByTagName('li');
    for (var i = 0; i < obj.length; i++) {
        if (i == value) {
            obj[i].innerHTML = name;
        }
    }
}

// tab栏方法封装
function tab(tab_list, itme, liname) {
    var tablist = document.querySelector(tab_list);
    var lis = tablist.querySelectorAll('li');
    var items = document.querySelectorAll(itme);
    for (var i = 0; i < lis.length; i++) {
        lis[i].setAttribute('index', i);
        lis[i].onclick = function () {
            for (var i = 0; i < lis.length; i++) {
                lis[i].className = '';
            }
            this.className = liname;
            var m = this.getAttribute('index');
            for (var i = 0; i < items.length; i++) {
                items[i].style.display = 'none';
            }
            items[m].style.display = 'block';

        }
    }
}

// MethodCall 调用方法
function MethodCall(Method, itm, urldaybefore, urldayafter, title) {
    var day = ['Seven', 'Six', 'Five', 'Four', 'Three', 'Two', 'One'];
    for (var i = 0; i < 7; i++) {
        Method(itm + (i + 1), urldaybefore + day[i] + urldayafter, title, i);
    }
}

//将数据视图转化为表格形式
function TableConversion(opt) {
    var axisData = opt.xAxis[0].data;
    var series = opt.series;
    var tdHeads = '<td  style="padding:0 10px">项目名称</td>';
    series.forEach(function (item) {
        tdHeads += '<td style="padding: 0 10px">' + item.name + '</td>';
    });
    var table = '<table border="1" style="margin-left:20px;border-collapse:collapse;font-size:14px;text-align:center"><tbody><tr>' + tdHeads + '</tr>';
    var tdBodys = '';
    for (var i = 0, l = axisData.length; i < l; i++) {
        for (var j = 0; j < series.length; j++) {
            if (typeof (series[j].data[i]) == 'object') {
                tdBodys += '<td>' + series[j].data[i].value + '</td>';
            } else {
                tdBodys += '<td>' + series[j].data[i] + '</td>';
            }
        }
        table += '<tr><td style="padding: 0 10px">' + axisData[i] + '</td>' + tdBodys + '</tr>';
        tdBodys = '';
    }
    table += '</tbody></table>';
    return table;
}

function HorizontalTableConversion(opt) {
    var axisData = opt.yAxis[0].data;
    var series = opt.series;
    var tdHeads = '<td  style="padding:0 10px">日期</td>';
    series.forEach(function (item) {
        tdHeads += '<td style="padding: 0 10px">' + item.name + '</td>';
    });
    var table = '<table border="1" style="margin-left:20px;border-collapse:collapse;font-size:14px;text-align:center"><tbody><tr>' + tdHeads + '</tr>';
    var tdBodys = '';
    for (var i = 0, l = axisData.length; i < l; i++) {
        for (var j = 0; j < series.length; j++) {
            if (typeof (series[j].data[i]) == 'object') {
                tdBodys += '<td>' + series[j].data[i].value + '</td>';
            } else {
                tdBodys += '<td>' + series[j].data[i] + '</td>';
            }
        }
        table += '<tr><td style="padding: 0 10px">' + axisData[i] + '</td>' + tdBodys + '</tr>';
        tdBodys = '';
    }
    table += '</tbody></table>';
    return table;
}