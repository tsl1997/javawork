let output = document.getElementById("output");//获取显示框
let btns = document.getElementsByName("btn");//点击事件
for(let i=0; i<btns.length; i++){
    btns[i].onclick=function(){
        output.value+=btns[i].value;//点击事件的字符串拼接
    }
}
document.getElementById("result").onclick=function(){
    output.value=eval(output.value);//将代码执行
}

