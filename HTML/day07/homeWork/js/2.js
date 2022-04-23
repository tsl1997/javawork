let div1 = document.getElementById("div1");
let timeId;
function showTime(){
    timeId = setInterval(time,3000);//3秒开会
}
function time(){
    let date = new Date();
    let fullYear = date.getFullYear();
    let month = date.getMonth()+1;
    let date1 = date.getDate();

    let hours = date.getHours();
    let minutes = date.getMinutes();
    let seconds = date.getSeconds();
    hours=hours>12?"下午"+(hours-12):"上午"+hours;//下午提示
    let time=fullYear+"年"+month+"月"+date1+"日&nbsp;"+hours+":"+minutes+":"+seconds;
    div1.innerHTML =time;
}
window.onload=function(){
    showTime();
}
document.getElementById("stop").onclick=function (){
    clearInterval(timeId);//停止运行
}
