# BlogApp

   ## Overview

   BlogApp is a simple blog post viewer developed using ReactJS. This project is designed as part of a hands-on lab to demonstrate the use of class-based              components, lifecycle methods, state management, and Fetch API integration in a React application.

   ## Features

   - Create and manage class-based components in React

  - Maintain component state and update UI accordingly

  - Fetch and display data from an external API (`https://jsonplaceholder.typicode.com/posts`)

  - Handle errors gracefully using `componentDidCatch`

  - Render blog post titles and bodies dynamically

  - Demonstrates lifecycle methods like `componentDidMount` for data fetching

  ## Folder Structure

   - `/src`
 
   - `App.js` - Main entry point integrating the `Posts` component
  
   - `Post.js` - Model class to define post structure
  
   - `Posts.js` - Class component that fetches and displays the list of posts

   ## Learning Outcomes

   - Understand how to build and structure class components in React

   - Learn how to manage and update state in class components

   - Gain practical experience with React lifecycle methods

   - Practice fetching remote data and updating the UI accordingly

   - Learn how to catch and display runtime errors within components

   ## Prerequisites

   - Node.js and npm installed

   - Basic knowledge of React and JavaScript

   - Code editor like Visual Studio Code

   ## Steps Followed

  1. Created the React application using `create-react-app` named `blogapp`

  2. Developed a `Post` class to define structure for blog posts

  3. Created a `Posts` component as a class-based React component

  4. Initialized component state to hold posts

  5. Fetched blog posts using Fetch API inside `loadPosts()` method

  6. Called `loadPosts()` within the `componentDidMount()` lifecycle hook

  7. Rendered the post titles and bodies inside the `render()` method

  8. Used `componentDidCatch()` to handle potential runtime errors

  9. Displayed fetched posts dynamically as headings and paragraphs

 10. Integrated the `Posts` component inside the `App` component

 11. Ran the app using `npm start` and verified output at `http://localhost:3000`


   ## Author
     Name: Sirimavilla Kaushik
     Date: 28-07-2025
     Language Used:ReactJS,Node.js,npm
