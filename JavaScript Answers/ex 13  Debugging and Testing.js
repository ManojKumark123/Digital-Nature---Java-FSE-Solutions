function submitRegistration(form) {
  console.log("Starting form submission...");

  const payload = {
    name: form.elements["name"].value,
    event: form.elements["event"].value
  };

  console.log("Payload to send:", payload);

  fetch("https://jsonplaceholder.typicode.com/posts", {
    method: "POST",
    body: JSON.stringify(payload),
    headers: { "Content-Type": "application/json" }
  })
  .then(res => {
    console.log("Response received:", res);
    return res.json();
  })
  .then(data => {
    console.log("Response data:", data);
  })
  .catch(error => {
    console.error("Fetch error:", error);
  });
}


