$("button").click(
    function () {
        //获取行列的数据
        let text = $(":text");
        let num1 = text[0].value;//获取行
        let num2 = text[1].value;//获取列
        let str = text[2].value;//获取文本
        if (!num1 || !num2 || !str) {//判断是否为空
            alert("内容/数字不能为空");
            return;
        }
        for (let i = 0; i < num1; i++) {
            let strHang = "<tr>";//设置行头
            for (let j = 0; j < num2; j++) {
                strHang += "<td>" + str + "</td>";//设置表格内容
            }
            strHang += "</tr>";//设置行尾
            $("table").append(strHang);//尾部添加
        }
    }
);