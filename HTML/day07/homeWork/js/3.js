function baiDu(){
    open("https://www.baidu.com");
}
let div1 = document.getElementById("div1");
let sec;
let id;
window.onload = function(){
    sec = new Date().getSeconds();
    id = setInterval(s2,1000);
}
function s1(){
    let sec1 = new Date().getSeconds();
    return 10-(sec1-sec);
}
function s2(){
    let number = s1();
    if(number>0 && number<10){
        div1.innerHTML=number+"秒后跳转百度首页";
    }else{
        clearInterval(id);
        baiDu();
    }
}