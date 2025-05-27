function Event(name, seats) {
  this.name = name;
  this.seats = seats;
}

Event.prototype.checkAvailability = function () {
  return this.seats > 0 ? "Available" : "Sold Out";
};

const workshop = new Event("Photography", 5);
console.log(workshop.checkAvailability());

console.log(Object.entries(workshop));
