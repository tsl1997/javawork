let es = document.getElementsByName("e");
for(let s=0;s<es.length;s++){
    es[s].onclick=function () {
        alert("点中了")
    }
}
alert("执行了吗")