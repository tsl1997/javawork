let cBox = $(":checkbox");//获取选择器
function boxClick(bool){//点击事件
    cBox.each(function(num,dom){
        $(dom).prop("checked",bool);
    })
}
$("#cilAll").click(//设置全选监听器
    function (){
        boxClick(true);//全部内容为true
    }
);
$("#cilNpAll").click(//设置全不选监听器
     function(){
        boxClick(false)//全部内容为false
    }
);
$("#NoCil").click(
    function(){
        NO();
    }
);
function NO(){//设置取反函数
    cBox.each(function(num,dom){
            let ck = $(dom).prop("checked");
            dom.checked=!ck;//取反操作
        })
}