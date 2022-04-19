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
	switch (fuhao){
		case "+":
			alert(num1+num2);
			break;
		case "-":
			alert(num1-num2);
			break;
		case "*":
			alert(num1*num2);
			break;
		case "/":
			alert(num1/num2);
			break;
		default:
			alert("Exception ");
			break;
	}
}