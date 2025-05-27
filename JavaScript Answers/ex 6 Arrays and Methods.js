let events = [
  { name: "Yoga", category: "Health" },
  { name: "Jazz Night", category: "Music" },
];

events.push({ name: "Rock Concert", category: "Music" });

const musicEvents = events.filter(e => e.category === "Music");

const cards = events.map(e => `Event: ${e.name}`);
console.log(cards);
