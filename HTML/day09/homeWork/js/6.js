function minus(i){//减少商品数量
    let e = $("[name='minus']+input")[i];
    let value = parseInt(e.value);
    if(value<=0){//数量合法验证
        alert("商品数量不能为负数");
        return;
    }
    e.value = value-1;//减法运算
}
function plus(i){//增加数量数量
    let e = $("[name='minus']+input")[i];
    let value = parseInt(e.value);
    e.value = value+1;//加法运算
}
function okShop() {
    let sum=0;
    let es = $("[name='minus']+input");
    let num1 = parseInt(es[0].value);
    let num2 = parseInt(es[1].value);
    let p1 = parseInt($("#price0").text());
    let p2 = parseInt($("#price1").text());
    sum=num1*p1+num2*p2;
    alert("你应该需要付费："+sum+"元");
}