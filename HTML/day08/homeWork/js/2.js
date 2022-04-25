let ps = $("p");//获取P标签的JQ对象数组
let nums = [23, 12, 59, 78, 62, 88];//设置默认数组
//循环遍历
function data(e) {
    $(nums).each(function (n, obj) {
        e.innerHTML += obj + "&emsp;";//保存到初始列表
    })
}
//执行代码
$(function () {
    data(ps[0]);//初始化数据
    numSum();//调用方法，获取sum值
    numSums();//显示总分
    average();//显示平均分
    MaoPao();//冒泡排序
    data(ps[3]);//排序后数据
    numMAx();//最大值显示
    numMin();//最小值显示
})
//冒泡排序
function MaoPao(){
    for (let i = 0; i < nums.length; i++) {
        for(let j = 0;j< nums.length-1-i; j++){
            if(nums[j]<nums[j+1]){
                let temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
        }
    }
}
//最大值。必须在排序后
function numMAx() {
    ps[4].innerHTML+=nums[0];
}
//最小值，必须在排序后
function numMin() {
    ps[5].innerHTML+=nums[nums.length-1];
}
//获取总分--在排序前后都可以
let sum=0;
function numSum() {
    $(nums).each(function (n, obj) {
        sum+=obj;
    })
}
function numSums(){
    ps[1].innerText+=sum;
}
function average() {
    ps[2].innerHTML+=parseInt(sum/nums.length);
}




