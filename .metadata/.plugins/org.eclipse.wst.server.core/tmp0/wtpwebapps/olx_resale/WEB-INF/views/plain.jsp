<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
<head>

<script>
function validateForm(){
	var uname = document.forms["myForm"]["your-name"].value;
	var unamecheck=/^[A-Z][a-z0-9]{3,20}$/;
	var Email = document.forms["myForm"]["your-email"].value;
	 var echeck=/^[\w._+]+@[\w.-]+\.[a-zA-Z]{2,4}$/;
	var phonenumber = document.forms["myForm"]["your-phone"].value;
	 var pcheck =  /^([0|\+[0-9]{1,5})?([7-9][0-9]{9})$/;
	 var password=document.forms["myForm"]["your-pass"].value;
	 
    if(uname.length==0){
         document.getElementById("div1").innerHTML="*username required";
        document.getElementById("div1").style.color="orange";
        return false;
            
       }
    else if(!unamecheck.test(uname))
    {
        document.getElementById("div1").innerHTML="First Character should be in uppercase";
        document.getElementById("div1").style.color="Red";
        return false;
    }
    else{
    document.getElementById("div1").innerHTML=" ";
   
    }
     
    
    if(Email.length==0){
         document.getElementById("div2").innerHTML="*Email required";
        document.getElementById("div2").style.color="orange";
        return false;
       }
    
   else  if(!echeck.test(Email))
    {
        document.getElementById("div2").innerHTML="Enter the valid email address using '@' and '.'";
        document.getElementById("div2").style.color="Red";
        return false;
    }
    else{
       document.getElementById("div2").innerHTML="";
  
}
    
     if(phonenumber.length==0){
         document.getElementById("div3").innerHTML="*Contact number required";
        document.getElementById("div3").style.color="orange";
        return false;
            
       }
  else  if(!pcheck.test(phonenumber))
    {
        document.getElementById("div3").innerHTML="Enter 10 digit valid contact number";
        document.getElementById("div3").style.color="Red";
        return false;
    }
    else
    {
       document.getElementById("div3").innerHTML=" ";
        
    }
     if(password.length==0){
         document.getElementById("div4").innerHTML="*Password required";
        document.getElementById("div4").style.color="orange";
        return false;
            
       }
     else if(password.length<6|| password.length>16){
    	 document.getElementById("div4").innerHTML="Enter password size between 6 and 15";
         document.getElementById("div4").style.color="Red";
         return false;
    	 
     }
     
     else{
    	 document.getElementById("div4").innerHTML="Password is strong "; 
    	    
     }
     
     
    
}
</script>
</head>
<body>

<form name="myForm"  action="/olx_resale/fetch" method="post" onsubmit="return validateForm()">
	<div class="form-group">
		<label>Your Name</label> <span id="div1"></span>
		<input type="text" name="your-name" class="form-control" placeholder="Enter your Name">
	</div>
	<div class="form-group"> 
		<label>Your Email</label> <span id="div2"></span>
		<input type="text" name="your-email" class="form-control" placeholder="Enter your Email">
	</div>
	<div class="form-group">
		<label>Your Phone</label> <span id="div3"></span>
		<input type="text" name="your-phone" class="form-control" placeholder="Enter your Phone">
	</div>
	<div class="form-group">
		<label>Your pass</label> <span id="div4"></span>
		<input type="password" name="your-pass" class="form-control" placeholder="Enter your Phone">
	</div>
	 
	<div class="form-group">
		<input type="submit" value="Send">
	</div>
</form>

</body>
</html>
