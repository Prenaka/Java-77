let xhr;
function searchEmployee(empno)
{
 //alert('Employee Number entered - '+ empno);
 //initialize XMLHttpRequest
 xhr = new XMLHttpRequest();
 
 xhr.open("GET","search?eno="+empno, true); //GET->Http Method, true --> asynchronous communication
 
 xhr.onreadystatechange = stateChanged;
 
 xhr.send();
}

function stateChanged(){
 //alert('XHR State = '+ xhr.readyState)
 let name = 'NOT VALID'
 let sal = 'NOT VALID'
 
 if(xhr.readyState==4 && xhr.status==200){
   //get the response
   let response = xhr.responseText;
   if(response.length>0){
     //convert response to JSON type
     responseObj = JSON.parse(response);
     name = responseObj.ename 
     sal = responseObj.salary
   }
   document.getElementById("empname").innerText = name;
   document.getElementById("salary").innerText = sal;
 }
}