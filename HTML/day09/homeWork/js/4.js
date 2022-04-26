let province = ["湖北省", "河南省", "湖南省", "河北省"];
//使用省份名称为key，存入该省对应的市
province["湖北省"] = ["武汉市", "黄冈市", "襄阳市", "荆州市"];
province["河南省"] = ["郑州市", "信阳市", "洛阳市", "驻马店"];
province["湖南省"] = ["长沙市", "郴州市", "岳阳市", "衡阳市"];
province["河北省"] = ["石家庄市", "邯郸市", "秦皇岛市"];
//一个格式，实现市和区的对应
province["武汉市"] = ["洪山区", "武昌区", "汉口区"];
province["襄阳市"] = ["襄州区", "宜城市", "谷城市"];
province["长沙市"] = ["羊区", "人区"];
let se = $("select");
$(function () {//网页加载后开始执行,加载省份
    for (let i = 0; i < province.length; i++) {
        se[0].innerHTML += "<option>" + province[i] + "</option>";
    }
})
$(se[0]).change(//选择省份时，加载城市
    function () {
       let city = province[this.value];
       se[1].innerHTML='<option value="选择">====请选择城市===</option>';//先清空掉
        for (let i = 0; i < city.length; i++) {
            se[1].innerHTML += "<option>" + city[i] + "</option>";
        }
        se[2].innerHTML ="<option value='选择'>====请选择区/县===</option>";
    }
)
$(se[1]).change(//选择城市时，加载区
    function () {
        let qu = province[this.value];
        se[2].innerHTML ="<option value='选择'>====请选择区/县===</option>";
        for (let i = 0; i < qu.length; i++) {
            se[2].innerHTML += "<option>" + qu[i] + "</option>";
        }
    }
)
$("button").click(
    function(){
        let s = $("select option:selected");//获取被选择的下拉列表
        let s1 = s[0].innerText;//获取省份
        let s2 = s[1].innerText;//获取城市
        let s3 = s[2].innerText;//获取区县
        let s4 = $(":text").val();//获取内容
        alert(s1 + "-- " + s2 + "-- " + s3 + "--" +s4);
    }
)