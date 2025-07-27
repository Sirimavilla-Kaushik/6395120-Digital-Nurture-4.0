import React from "react";
import CohortDetails from "./CohortDetails";
const cohorts = [
  {
    name: "React Bootcamp",
    status: "ongoing",
    coach: "Alice",
    trainee: "John",
    startDate: "2025-06-01"
  },
  {
    name: "Angular Mastery",
    status: "completed",
    coach: "Bob",
    trainee: "Emma",
    startDate: "2025-05-01"
  },
];
function App() {
  return (
    <div>
      {cohorts.map((cohort) => (
        <CohortDetails cohort={cohort} key={cohort.name} />
      ))}
    </div>
  );
}

export default App;
