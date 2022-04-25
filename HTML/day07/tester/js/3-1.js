function ids(id){
    return document.getElementById(id);
}
let es;
ids("go").onclick=function(){
    let num1 = parseInt(ids("iHang").value);
    let num2 = parseInt(ids("iLie").value);
    if(!num1 || !num2){
        return ;
    }
    let str="<table border='1' cellspacing='0' cellpadding='20px'>";
    for(let i=0; i<num1; i++){
        str+="<tr>";
        for(let j=0; j<num2; j++){
            str+="<td name='e'></td>"
        }
        str+="</tr>";
    }
    let div1 = ids("div1");
    div1.innerHTML=str;
    es = document.getElementsByName("e");//获取表格集合
    eClick();//调用函数
}
//点击表格操作
function eClick() {
    for (let s = 0; s < es.length; s++) {
        es[s].onclick = function () {
            //alert("点中了");//判断是否点击了
            eColor(es[s]);//改变颜色
        }
    }
}
//变色，当点击发生后，表格颜色发生改变
function eColor(e) {
    if (e.style.backgroundColor === "") {//当棋盘为空时
        e.style.backgroundColor = "#bcfffa";//下棋，变成蓝色
        eAdminColor();//下棋成功，机器人下棋
        return;
    }else{
        alert("此处有棋子，不能下在这里。");//有棋子时提示不能下
    }
}
//机器人下棋
function eAdminColor() {
    //随机下棋,获取随机数
    let num = parseInt(Math.random()*es.length);
    if(es[num].style.backgroundColor === ""){
        es[num].style.backgroundColor = "#ffb3ff";
        return;
    }else{
        eAdminColor();//当下棋失败时递归，重复下棋
    }
}