$(function () {

    //答案的显示与隐藏
    $(".question-group").bind("click",function () {

        //只实现了显示，还需要写隐藏的
        // $(this).next("div.answer-none").removeClass("answer-none").addClass("answer-group");

        //切换可见状态，1000ms (没有判断是否处于动画中，多次点击多次执行)
        // $(this).next("div.answer-none").toggle(1000);

        var answer = $(this).next("div.answer-none");
        if(!answer.is(":animated")){
            //切换可见状态，1000ms
            answer.toggle(1000);
        }
    });

    //substring()
    var string = "0123456789";

    //jQuery操作
    $("#btn1-1").click(function () {
        alert(string.substring(2));
    });

    $("#btn1-2").click(function () {
        alert(string.substring(6, 8));
    });

    //DOM操作
    // document.getElementById("btn1").onclick = function () {
    //     alert(string.substring(2));
    // };
    //
    // document.getElementById("btn2").onclick = function () {
    //     alert(string.substring(2, 8));
    // };

    //typeof
    $("#btn3-1").click(function () {
        alert(typeof(123)); //'number'
    });

    $("#btn3-2").click(function () {
        alert(typeof "123");  //'string'
    });

    $("#btn3-3").click(function () {
        alert(typeof NaN);   //'number'
    });

    $("#btn3-4").click(function () {
        alert(typeof null);  //'object'
    });

    $("#btn3-5").click(function () {
        alert(typeof String('123'));  //'string'
    });

    $("#btn3-6").click(function () {
        alert(typeof new String("123"));  //'object'
    });
});