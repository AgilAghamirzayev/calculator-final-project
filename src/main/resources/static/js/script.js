const check = function () {
    if (document.getElementById('password').value ===
        document.getElementById('confirm_password').value) {
        document.getElementById('message').style.color = 'green';
        document.getElementById('message').innerHTML = 'matching';
    } else {
        document.getElementById('message').style.color = 'red';
        document.getElementById('message').innerHTML = 'not matching';
    }
};

function checkPass(){
    const pass = document.getElementById("password").value;
    const rpass = document.getElementById("confirm_password").value;
    if(pass !== rpass){
        document.getElementById("submit").disabled = true;
        $('.missmatch').html("Entered Password is not matching!! Try Again");
    }else{
        $('.missmatch').html("");
        document.getElementById("submit").disabled = false;
    }
}