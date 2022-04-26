//设置背景颜色
function bgColor() {
    $("tbody tr:even").css("backgroundColor", "pink");//偶数行的颜色为粉色
    $("tbody tr:odd").css("backgroundColor", "#d5f6f1");//奇数行的颜色为粉色
}
bgColor();//开始运行调用
//添加行
$("button").first().click(
    function () {
        let last = $("tbody tr").last().clone();
        $("tbody").append(last);
        bgColor();
    }
);
//删除
$("button").last().click(
    function () {
        let ckBox = $(":checkbox:checked:not('#All')");
        ckBox.each(
            function (i, dom) {
                $(dom).parent().parent().remove();//删除自身
            })
        bgColor();
    }
)
//全选操作
$("#All").click(
    function () {
        let ckBox = $(":checkbox:not('#All')");//寻找所以的标签
        ckBox.each(
            function (i, dom) {
                dom.checked = $("#All").prop("checked");//设置和全选一样属性
            }
        )
    }
);

