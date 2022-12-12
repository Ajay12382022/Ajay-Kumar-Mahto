let age = "";
let errorMessage = "";
let givenDay = "";

const dayInput = document.getElementById("day");
const monthInput = document.getElementById("month");
const yearInput = document.getElementById("year");

function render() {
  const today = new Date();

  const resultNode = document.getElementById("result");
  resultNode.innerText = age;

  const errorNode = document.getElementById("error");
  errorNode.innerText = errorMessage;

  const givenDateNode = document.getElementById("given-date");
  givenDateNode.innerText = "Given day is " + givenDay;

  const todayDateNode = document.getElementById("today-date");
  todayDateNode.innerText = "Today is " + getDayName(today.getDay());
}

function getDayName(dayNum) {
  switch (dayNum) {
    case 0:
      return "Sunday";
    case 1:
      return "Monday";
    case 2:
      return "Tuesday";
    case 3:
      return "Wednesday";
    case 4:
      return "Thursday";
    case 5:
      return "Friday";
    case 6:
      return "Saturday";
    default:
      throw new Error("Invalid Day Number");
  }
}

function isLeapYear(year) {
  if (year % 4 === 0) {
    if (year % 100 === 0 && year % 400 !== 0) {
      return true;
    }
    return false;
  }

  return false;
}

function getDaysForMonth(month, year) {
  const leapYear = isLeapYear(year);
  switch (month) {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
      return 31;
    case 4:
    case 6:
    case 9:
    case 11:
      return 30;
    case 2:
      return leapYear ? 29 : 28;
    default:
      throw new Error("Month does not exist");
  }
}

function onSubmit() {
  const today = new Date();

  let yearDifference = today.getFullYear() - Number(yearInput.value);
  let monthDifference = today.getMonth() + 1 - Number(monthInput.value);
  let daysDifference = today.getDate() - Number(dayInput.value);

  if (daysDifference < 0) {
    daysDifference = getDaysForMonth(today.getMonth() + 1) + daysDifference;
    monthDifference--;
  }
  if (monthDifference < 0) {
    monthDifference = 12 + monthDifference;
    yearDifference--;
  }


  age = `${yearDifference} years ${monthDifference} months ${daysDifference} days`;

  const givenDate = new Date();
  givenDate.setDate(dayInput.value);
  givenDate.setMonth(monthInput.value - 1);
  givenDate.setFullYear(yearInput.value);

  givenDay = getDayName(givenDate.getDay());

  dayInput.value = "";
  monthInput.value = "";
  yearInput.value = "";

  render();
}

function validateDay(event) {
  const day = Number(event.target.value);

  if (day < 0) {
    errorMessage = "Day cannot be less than 0";
  } else if (day > 31) {
    errorMessage = "Day cannot be greater than 31";
  } else {
    errorMessage = "";
  }

  render();
}

function validateMonth(event) {
  const month = Number(event.target.value); // NaN

  if (Number.isNaN(month)) {
    alert("This is not a number.");
  }
}

function validateYear(event) {}

dayInput.addEventListener("change", validateDay);
monthInput.addEventListener("change", validateMonth);
yearInput.addEventListener("change", validateYear);

const submitButton = document.getElementById("submit");
submitButton.addEventListener("click", onSubmit);

render();
