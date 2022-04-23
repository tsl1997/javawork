//判断用户名是否为空
let username = document.getElementById("username");
function name() {
    if (!username.value) {
        username.select();//选中
        return false;//返回F
    }
    return true;//返回T
}
username.onblur = function () {
    name();
}
//判断密码是否大于6位
let pass1 = document.getElementById("pass1");
function password() {
    let value = pass1.value;
    if (value.length < 6) {
        pass1.select();//
        return false;
    }
    return true;//
}
pass1.onblur = function () {
    password();
}
//判断密码是否一样
let pass2 = document.getElementById("pass2");
function toPassword() {
    let p2 = pass2.value;
    let p1 = pass1.value;
    if(p2!==p1){
        pass2.select();//
        return false;
    }
    return true;//
}
pass2.onblur=function(){
    toPassword();
}
//判断邮箱是否正确
let email = document.getElementById("email");
function mail() {
    let mailText = email.value;
    if(!mailText){
        email.select();//
        return false;//当没有值时返回F
    }
    let index1 = mailText.indexOf("@");
    if(index1<1){
        email.select();//
        return false;//当@不存在时返回F，首位不能是@符号
    }
    let index2 = mailText.lastIndexOf("@");
    if(index2!==index1){
        email.select();//
        return false;//当出现了2个@时，返回F
    }
    let index3 = mailText.lastIndexOf(".");
    if(index3<=index2+1){
        email.select();//
        return false;//当@在最后的.后面时，域名解析错误，返回F 而且@和.中间必须有顶级域名
    }
    if(index3===mailText.length){
        email.select();//
        return false;//域名最后不能以.结尾
    }
    return true;//以上都通过，返回T
}
email.onblur=function(){
    mail();
}
function isOk() {
    let newVar = name() && password() && toPassword() && mail();
    return newVar;//最终判断
}
