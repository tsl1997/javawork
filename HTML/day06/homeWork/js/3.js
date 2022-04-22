//当点击生成表格的时候
document.getElementById("go").onclick = function(){
    let num1 = getNum("iHang");//获取行里面的数值
    let num2 = getNum("iLie");
    if(!num1 || !num2){
        alert("请输入数字");
        return "";
    }
    //生成table
    let div1 = document.getElementById("div1");
    let table = document.createElement("table");
    div1.appendChild(table);

    for(let i = 0; i < num1;i++) {
        let tr = document.createElement("tr");
        table.appendChild(tr);
        for(let j = 0; j < num2;j++) {
            let td = document.createElement("td");
            tr.appendChild(td);
            let text = document.createTextNode("文本");
            td.appendChild(text);
        }
    }

}
//获取输入框的值
function getNum(id) {
    let elementById = document.getElementById(id);
    return  parseInt(elementById.value);//返回输入的数值
}





