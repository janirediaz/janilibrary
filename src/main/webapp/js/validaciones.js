

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
        alert("El email no tiene el formato correcto, por favor revisalo")
    }
















