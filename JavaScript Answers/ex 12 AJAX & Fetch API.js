const userRegistration = {
  name: "John Doe",
  email: "john@example.com",
  event: "Community Picnic"
};

fetch("https://jsonplaceholder.typicode.com/posts", {
  method: "POST",
  headers: {"Content-Type": "application/json"},
  body: JSON.stringify(userRegistration)
})
.then(response => response.json())
.then(data => {
  setTimeout(() => alert("Registration successful!"), 1500);
})
.catch(() => {
  alert("Registration failed. Please try again.");
});
