document.getElementById("phone").onblur = function () {
    phone();
}
//判断电话好慢
function phone() {
    let objText = document.getElementById("phone");
    let phone = objText.value;
    let reg = /^1[35789]\d{9}$/;
    let bool = regOk(reg, phone);
    if (!bool) {
        objText.select();
        return bool;
    }
    return bool;
}
//正则验证
function regOk(reg, demo) {
    if (!reg.test(demo)) {
        return false;
    }
    return true;
}
document.getElementById("email").onblur = function () {
    email();
}
//判断邮箱
function email() {
    let objText = document.getElementById("email");
    let email = objText.value;
    let reg = /^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
    let bool = regOk(reg, email);
    if (!bool) {
        objText.select();
        return bool;
    }
    return bool;
}
//定义通用数据
let passRepeat = document.getElementById("passRepeat");
let password = document.getElementById("password");
let miMa;
passRepeat.onblur = function () {
    pass2();
}
//重复密码
function pass2() {
    let miMa2 = passRepeat.value;
    if (miMa2 !== miMa) {
        passRepeat.select();
        return false;
    }
    return true;
}
password.onblur = function () {
    pass1();
}
//首次密码不能为空
function pass1() {
    miMa = password.value;
    if (!miMa) {
        password.select();
        return false;
    }
    return true;
}
let name = document.getElementById("username");
name.onblur = function () {
    nameOk();
}
//姓名不能为空
function nameOk() {
    if (!name.value) {
        name.select();
        return false;
    }
    return true;
}
//选择框不为空
function idoK() {
    let is = document.getElementById("isOk");
    if (!is.checked) {
        return false;
    }
    return true;
}
//判断
function submitOK() {
    let newVar = idoK() && nameOk() && pass1() && pass2() && email() && phone();
    alert(newVar);//结果提示
    return  newVar;
}

