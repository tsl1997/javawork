//定义数组保存所有的省
let province=["湖北省","河南省","湖南省","河北省"];
//使用省份名称为key，存入该省对应的市
province["湖北省"]=["武汉市","黄冈市","襄阳市","荆州市"];
province["河南省"]=["郑州市","信阳市","洛阳市","驻马店"];
province["湖南省"]=["长沙市","郴州市","岳阳市","衡阳市"];
province["河北省"]=["石家庄市","邯郸市","秦皇岛市"];
//一个格式，实现市和区的对应
province["武汉市"]=["洪山区","武昌区","汉口区"];
province["襄阳市"]=["襄州区","宜城市","谷城市"];
province["长沙市"]=["羊区","人区"];
//初始化内容
window.onload=function() {
    let objParentSelect=document.getElementById("sheng");
    addChild(objParentSelect,province);//调用添加方法
}
//2 选择城市
sheng.onchange=function() {
    let arrCities=province[this.value];//获取子类
    two("shi",arrCities)};
//3 选择区
shi.onchange=function(){
    let arrCities=province[this.value];//获取子类
    two("qu",arrCities)};
//定义删除函数
function aLLDelete(father,son) {
    while(son.length>1){
        father.removeChild(son[1]);
    }
}
//定义添加函数
function addChild(father,son) {
    for (let i = 0; i < son.length; i++) {
        let strProv = son[i];//获取son名称
        //1.创建option
        let objNewOp = document.createElement("option");
        //2.设置option内部显示的数据
        let objText = document.createTextNode(strProv);
        //3.将文本对象设置到option显示
        objNewOp.appendChild(objText);
        //4.将设置好的option，放到select显示
        father.appendChild(objNewOp);
    }
}
//二级以下联动通用公式
function two(String,arrCities) {
    let objCitySel=document.getElementById(String);//父类
    let arrSon=objCitySel.getElementsByTagName("option");//子类
    aLLDelete(objCitySel,arrSon);//三处
    addChild(objCitySel,arrCities);//调用添加方法
}






