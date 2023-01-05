function validateForm(form) {
    var name = document.val.fname.value;
    var ph=document.val.phoneno.value;
    var uname = document.val.uname.value;
    var pass = document.val.psw.value;
    var con_pass=document.val.psw1.value;
    var check=  /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$/;

    if (name==null || name==""){
        document.getElementById("error").innerHTML="Please enter name";
    }

    if ( ( form.gender[0].checked == false ) && ( form.gender[1].checked == false ) )
    {
        document.getElementById("error").innerHTML="Please choose gender";

    }

    if(ph.length<10 || ph.length>10){
        document.getElementById("error").innerHTML="Please enter valid phoneno";

    }

    if (uname==null || uname==""){
        document.getElementById("error").innerHTML="Please enter username";

    }
    if(pass==con_pass){
        document.getElementById("gg").innerHTML="Password matches with confirm password";

    }
    else{
        document.getElementById("error").innerHTML="Password must be same!";
    }

    if(pass.match(check))
    {
        document.getElementById("ok").innerHTML="Password satisfies all conditions";
        return false;
    }
    else{
        document.getElementById("error").innerHTML="Please choose all conditions for password";
    }





}