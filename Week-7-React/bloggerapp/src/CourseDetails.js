import React from "react";

function CourseDetails({ courses }) {
  return (
    <div className="mystyle1">
      <h1>Course Details</h1>
      {courses.length > 0 && courses.map((course) => (
        <div key={course.id}>
          <h3>{course.cname}</h3>
          <p>{course.date}</p>
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;
