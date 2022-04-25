$("button").click(
    function (){
        isOk();//调用函数
    }
);
function isOk(){
    // let username = $(":text")[0].value;
    // let password = $(":password")[0].value;
    let username = $(":text").prop("value");
    let password = $(":password").prop("value");
    if((username==="admin") && (password==="123456")){
        open("https://www.baidu.com");
    }else{
        alert("账号或者密码输入错误");
    }
}