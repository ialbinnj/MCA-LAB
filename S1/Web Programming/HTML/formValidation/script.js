document.getElementById("regForm").addEventListener("submit",(e)=>{
  let uname=document.getElementById("username").value;
  let email=document.getElementById("email").value;
  let password=document.getElementById("password").value;
  let cpassword=document.getElementById("cpassword").value;
  let emsg=document.getElementById("emsg")
  
  emsg.innerHTML="";
  
  if(password!=cpassword){
     emsg.innerHTML="Password Incorrect"
     e.preventDefault()
  }else if(password.length <= 8){
     emsg.innerHTML="Password must be at least 8 characters long!"
     e.preventDefault()
  }else{
     alert("Registration successfull")
  }
})
