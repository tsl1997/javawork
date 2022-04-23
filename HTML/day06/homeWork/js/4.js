//点击选中的添加到右边
let div1 = document.getElementById("div1");//获取div1标签---父类
let div2 = document.getElementById("div2");//获取div2标签---父类
let subs = div1.getElementsByClassName("subject");//获取div1里面的subject类名标签---子类
let subs2 = div2.getElementsByClassName("subject");//获取div2里面的subject类名标签---子类
document.getElementById("left1").onclick = function(){
   selection(subs,div1,div2);
}
//点击全部添加到右边
document.getElementById("left2").onclick = function () {
    se2(subs,div1,div2);
}
//选择添加到左边
document.getElementById("right1").onclick = function () {
    selection(subs2,div2,div1);
}
//点击全部添加到左边
document.getElementById("right2").onclick = function () {
    se2(subs2,div2,div1);
}
function selection(subs,div1,div2){
    for (let i = 0; i < subs.length; i++) {
        let sub = subs[i];
        let names = sub.getElementsByTagName("input");
        if (names[0].checked) {//当标签被选中时
            let node = sub.cloneNode(true);//克隆
            let eName = node.getElementsByTagName("input");
            eName[0].checked=!eName[0].checked;//取消选中状态
            div2.appendChild(node);//复制
            div1.removeChild(sub);//删除
            i--;//控制下标
        }
    }
}
function se2(subs,div1,div2){
    for (let i = 0; i < subs.length; i++) {
        let sub = subs[i];
        let node = sub.cloneNode(true);//克隆
        let names = sub.getElementsByTagName("input");
        if (names[0].checked) {//当标签被选中时
            let eName = node.getElementsByTagName("input");
            eName[0].checked = !eName[0].checked;//取消选中状态
        }
        div2.appendChild(node);//复制
        div1.removeChild(sub);//删除
        i--;//控制下标
    }
}
