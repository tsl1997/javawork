function yuns(){
	var fuhao=document.getElementById("yun").value;
	var num1=document.getElementById("num1").value;
	var num2=document.getElementById("num2").value;
	num1=parseFloat(num1);
	num2=parseFloat(num2);
	if(!num1 || !num2){
		alert("请输入数字");
		return;
	}
	let jieguo = document.getElementById("jieguo");
	switch (fuhao){
		case "+":
			jieguo.value=num1+num2;
			break;
		case "-":
			jieguo.value=num1-num2;
			break;
		case "*":
			jieguo.value=num1*num2;
			break;
		case "/":
			jieguo.value=num1/num2;
			break;
		default:
			alert("操作错误，请不要随意修改前端页面。");
			break;
	}
}