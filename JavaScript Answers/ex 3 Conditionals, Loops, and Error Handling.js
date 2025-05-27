const events = [
  { name: "Music Fest", date: "2025-07-01", seats: 0 },
  { name: "Art Class", date: "2025-06-10", seats: 10 },
  { name: "Past Meetup", date: "2024-12-01", seats: 5 },
];

const today = new Date("2025-06-01");

events.forEach(event => {
  const eventDate = new Date(event.date);
  if (eventDate > today && event.seats > 0) {
    console.log(`Upcoming Event: ${event.name}`);
  } else {
    console.log(`Skipping event: ${event.name}`);
  }
});

function register(event) {
  try {
    if (event.seats <= 0) throw new Error("Event is full.");
    event.seats--;
    console.log("Registered successfully.");
  } catch (error) {
    console.error(error.message);
  }
}
