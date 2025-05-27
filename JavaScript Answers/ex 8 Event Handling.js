HTML:
<input type="text" id="search" placeholder="Search events..." />
<select id="category">
  <option>All</option>
  <option>Music</option>
</select>
<button onclick="register()">Register</button>

JS:
function register() {
  alert("Registered!");
}

document.getElementById("category").onchange = function (e) {
  console.log("Category selected:", e.target.value);
};

document.getElementById("search").addEventListener("keydown", function (e) {
  console.log("Typed:", e.key);
});

