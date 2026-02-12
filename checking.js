

const loginForm=document.getElementById('loginForm');
const errorMessage=document.getElementById('errorMessage');

loginForm.addEventListener('submit',function(event) {
    event.preventDefault();

    const name=loginForm.name.value;
    const password=loginForm.password.value;

   if(name==""&&password=="") 
    {
        errorMessage.textContent='Please fill out both fields.';
    } else if(name=="") 
    {
        errorMessage.textContent='Enter your Name.';
    } else if(password=="") 
    {
        errorMessage.textContent='Enter your Password.';
    } else {
        // Perform login logic here
        // For example, you can redirect the user to a logged-in page
        // window.location.href = 'logged-in.html';
    }
});

 