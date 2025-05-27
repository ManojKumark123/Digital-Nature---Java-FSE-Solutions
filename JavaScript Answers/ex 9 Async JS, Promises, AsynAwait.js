function getEvents() {
  return fetch("https://jsonplaceholder.typicode.com/posts")  // Mock API endpoint
    .then(response => response.json())
    .then(data => {
      console.log("Events loaded:", data.slice(0, 3));  // Show first 3
    })
    .catch(error => {
      console.error("Error loading events:", error);
    });
}

async function getEventsAsync() {
  try {
    console.log("Loading events...");
    const response = await fetch("https://jsonplaceholder.typicode.com/posts");
    const data = await response.json();
    console.log("Events loaded (async):", data.slice(0, 3));
  } catch (error) {
    console.error("Error:", error);
  }
}

getEvents();
getEventsAsync();
