function addEvent(name, category) {
  return { name, category };
}

function registerUser(eventName) {
  console.log(`${eventName}: User registered.`);
}

function eventCounter(category) {
  let count = 0;
  return function () {
    count++;
    console.log(`${category} registrations: ${count}`);
  };
}

const countMusic = eventCounter("Music");
countMusic();
countMusic();

function filterEvents(events, callback) {
  return events.filter(callback);
}

const filtered = filterEvents(
  [{ name: "Dance", category: "Music" }],
  e => e.category === "Music"
);
console.log(filtered);
