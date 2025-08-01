# Cohort Dashboard React Application

   A simple and modular React application developed by the **My Academy team at Cognizant** to display the details of **ongoing** and **completed** cohorts. This      project demonstrates how to effectively use **React components**, **CSS Modules**, and **conditional rendering** to create clean and styled UI elements.

   ## Project Structure

                                       cohort-dashboard/
                                               ├── node_modules/
                                               ├── public/
                                               ├── src/
                                               │ ├── App.js
                                               │ ├── CohortDetails.js
                                               │ ├── CohortDetails.module.css
                                               │ └── index.js

   ## Components Overview

   ### 📌 App Component (`App.js`)

   - Serves as the root component.

   - Renders the `CohortDetails` component to display cohort information.

   ### 📌 CohortDetails Component (`CohortDetails.js`)

   - Displays individual cohort details.

   - Dynamically changes the heading color based on the status:
  
   - 🟢 Green for "ongoing"
 
   - 🔵 Blue for other statuses

   - Utilizes the CSS Module for scoped styling.

   ## Styling Approach

   ### CSS Module File: `CohortDetails.module.css`

   - Provides styling specific to the `CohortDetails` component.

   - Includes:
  
     - `.box` class to define layout, borders, and spacing.
  
     - Styling for `<dt>` tag to give labels distinct font weight.
 
     - Border radius, padding, and margin for card-like appearance.

     - Ensures modularity and no style leakage.

   ##  Setup Instructions

   1. **Unzip** the provided React project folder.

   2. Open a **terminal** and navigate to the project directory.

   3. Run `npm install` to **restore all dependencies**.

   4. Open the project in **Visual Studio Code**.
 
   5. Run `npm start` to launch the application in your browser.


   ## Functional Features

   -  Each cohort is displayed inside an individual styled box.

   -  Conditional heading colors indicate status:
  
   - Green for "ongoing"
  
   - Blue for completed or other statuses

   -  Neatly separated details using `<dl>`, `<dt>`, and `<dd>` elements.

   -  Clean layout using inline blocks with proper spacing.


   ## Learning Objectives

   - Understand the use of **CSS Modules** in React.

   - Learn to apply **conditional rendering** in styling elements.

   - Build reusable and well-structured components using **React**.

   - Maintain **clean UI design** using modular CSS and component logic.


   ## Author
     Name: Sirimavilla Kaushik
     Date: 29-07-2025
     Language Used:ReactJS,Node.js,npm
