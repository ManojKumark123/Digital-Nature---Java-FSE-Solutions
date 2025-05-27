const defaultCategory = "All";

const listEvents = (events = [], category = defaultCategory) => {
  const filteredEvents = [...events].filter(({category: cat}) =>
    category === "All" || cat === category
  );
  return filteredEvents;
};

const allEvents = [
  {name: "Film Screening", category: "Entertainment"},
  {name: "Dance Workshop", category: "Music"}
];

console.log(listEvents(allEvents, "Music"));
