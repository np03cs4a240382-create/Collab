const signupForm = document.getElementById('signupForm');
const password = document.getElementById('password');
const confirmPassword = document.getElementById('confirmPassword');
const matchMessage = document.getElementById('matchMessage');

function validatePasswords() {
    if (confirmPassword.value === "") {
        matchMessage.innerText = "";
        confirmPassword.style.borderColor = "#ccc";
        return;
    }

    if (password.value === confirmPassword.value) {
        matchMessage.innerText = "✓ Passwords match";
        matchMessage.style.color = "#28a745"; /* Green for match */
        confirmPassword.style.borderColor = "#28a745";
    } else {
        matchMessage.innerText = "× Passwords do not match";
        matchMessage.style.color = "#dc3545"; /* Red for mismatch */
        confirmPassword.style.borderColor = "#dc3545";
    }
}

// Check matching on every keystroke
password.addEventListener('input', validatePasswords);
confirmPassword.addEventListener('input', validatePasswords);

// Form submission handler
signupForm.addEventListener('submit', (e) => {
    e.preventDefault();
    
    if (password.value !== confirmPassword.value) {
        alert("Please ensure your passwords match before submitting.");
        return;
    }

    alert("Account created successfully. Welcome to Vehicle Rental!");
    // Here you would typically send data to your server
});