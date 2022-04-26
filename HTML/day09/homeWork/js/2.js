// alert("测试拉");
let txt = "";
let btn = $("button");//获取按钮集合
//内部追加-尾部append
$(btn[0]).click(
    function () {
        txt = $(":text").val();//获取用户输入的内容
        if (txt) {
            $("ul").append("<li>" + txt + "</li>");
        } else {
            alert("请输入美女的名字！");
        }
    }
);
//内部插入-头部出入prepend
$(btn[1]).click(
    function () {
        txt = $(":text").val();//获取用户输入的内容
        if (txt) {
            $("ul").prepend("<li>" + txt + "</li>");
        } else {
            alert("请输入美女的名字！");
        }
    }
);
//同级追加-默认在最后1个后面追加after
$(btn[2]).click(
    function () {
        txt = $(":text").val();//获取用户输入的内容
        if (txt) {
            $("ul li").last().after("<li>" + txt + "</li>");
        } else {
            alert("请输入美女的名字！");
        }
    }
);
//同级插入-默认在第1个后面追加before
$(btn[3]).click(
    function () {
        txt = $(":text").val();//获取用户输入的内容
        if (txt) {
            $("ul li").first().before("<li>" + txt + "</li>");
        } else {
            alert("请输入美女的名字！");
        }
    }
);
//默认替换第一个
$(btn[4]).click(
    function () {
        txt = $(":text").val();//获取用户输入的内容
        if (txt) {
            $("ul li").first().replaceWith("<li>" + txt + "</li>");
        } else {
            alert("请输入美女的名字！");
        }
    }
);
//删除remove--删除第一个
$(btn[5]).click(
    function () {
        $("ul li").first().remove();
    }
);
//删除detach，默认删除最后一个
$(btn[6]).click(
    function () {
        $("ul li").last().detach();
    }
);
//清空表单empty
$(btn[7]).click(
    function () {
        if (confirm("是否要清空列表？")) {
            $("ul").empty();//子标签不能清除标签本身，只能清除内容
        }
    }
);
//克隆clone---默认在最后一排添加最后一个元素
$(btn[8]).click(
    function () {
        let clone = $("ul li").last().clone();//克隆最后一个
        $("ul li").last().after(clone);//尾部追加
    }
);


