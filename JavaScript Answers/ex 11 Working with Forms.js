const form = document.querySelector("#signupForm");

form.addEventListener("submit", event => {
  event.preventDefault();

  const name = form.elements["username"].value.trim();
  const email = form.elements["email"].value.trim();
  const eventChoice = form.elements["eventSelect"].value;

  if (!name) {
    alert("Please enter your name.");
    return;
  }
  if (!email.includes("@")) {
    alert("Please enter a valid email.");
    return;
  }

  console.log(`Registered ${name} for ${eventChoice} with email ${email}`);
});
