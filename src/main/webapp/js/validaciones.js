function validacion(){

    var todo_correcto = true;

    if(document.getElementById("nombre").value.length < 2){
        $("nombre").closest(".form-group").addClass("has-error");

    }else{
        $("nombre").closest(".form-group").removeClass("has-error").addClass("has-success");
    }

    if(document.getElementById("password").value.length < 6){
        $("password").closest(".form-group").addClass("has-error");
    }else{
        $("password").closest(".form-group").removeClass("has-error").addClass("has-success");
    }
    if (!(/\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)/.test(valor))) {
        todo_correcto = false;
    }


    if(!todo_correcto){
        alert("Algunos campos no están correctos, vuelva a revisarlos");
    }

    return todo_correcto;



}

var p1 = document.getElementById("password").value;
var p2 = document.getElementById("passRepeated").value;

if(p1 != p2){
    alert("Los passwords no coinciden");
}else{
    alert("Los passwords coinciden")
}








