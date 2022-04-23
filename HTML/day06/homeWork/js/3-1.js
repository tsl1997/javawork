function ids(id){
    return document.getElementById(id);
}
ids("go").onclick=function(){
    let num1 = parseInt(ids("iHang").value);
    let num2 = parseInt(ids("iLie").value);
    if(!num1 || !num2){
        return ;
    }
    let str="<table border='1' cellspacing='0' cellpadding='4px'>";
    for(let i=0; i<num1; i++){
        str+="<tr>";
        for(let j=0; j<num2; j++){
            str+="<td>文本</td>"
        }
        str+="</tr>";
    }
    let div1 = ids("div1");
    div1.innerHTML=str;
}