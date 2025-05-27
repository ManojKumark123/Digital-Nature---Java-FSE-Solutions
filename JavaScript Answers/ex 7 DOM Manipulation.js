HTML:
<div id="events"></div>

JS:
const eventList = [
  { name: "Community BBQ", seats: 10 },
  { name: "Coding Camp", seats: 5 }
];

const container = document.querySelector("#events");

eventList.forEach(event => {
  const card = document.createElement("div");
  card.textContent = `${event.name} - Seats: ${event.seats}`;
  container.appendChild(card);
});
