# TrainersApp

   A Single Page Application (SPA) built using **React** for Cognizant Academy teams to maintain and view a list of trainers and their expertise.

  ## Project Objective

   The goal of this application is to provide a centralized and user-friendly dashboard for viewing trainer details including their ID, name, contact, stream, and    technical skills.

  ## Getting Started

   ### Prerequisites

   - Node.js and npm installed

   - Code editor like **VS Code**

   - React CLI (`create-react-app`)

   - Internet connection to install dependencies

  ## Folder Structure

                TrainersApp/
                     ├── public/
                     ├── src/
                     │   ├── Trainer.js
                     │   ├── TrainersMock.js
                     │   ├── TrainerList.js
                     │   ├── Home.js
                     │   ├── TrainerDetails.js
                     │   └── App.js

  ## Features Implemented

   ### Trainer Model

   - Defined a `Trainer` class with the following properties:
  
   - TrainerId
 
   - Name
  
   - Email
  
   - Phone
 
   - Technology
 
   - Skills

   ### Mock Data

   - A file `TrainersMock.js` is used to store mock trainer data.

   ### Routing Support

   - Integrated `react-router-dom` for navigation using:
  
   - `BrowserRouter`
 
   - `Routes`
  
   - `Route`
  
   - `Link`

   ### Components

   - **Home** (`Home.js`)
  
      - Default landing page with a welcome message.

   - **Trainer List** (`TrainerList.js`)
  
      - Displays a list of trainer names as clickable links.

   - **Trainer Details** (`TrainerDetails.js`)
  
      - Fetches and displays trainer details using `useParams` from the route.

   ## Navigation

              | Route          | Component         | Description                        |
              |----------------|------------------|------------------------------------|
              | `/`            | Home             | Displays home page content         |
              | `/trainers`    | TrainersList     | Displays clickable list of trainers |
              | `/trainer/:id` | TrainerDetails   | Displays details of selected trainer |


   ## Final UI Layout

   ### Home Page

   - Welcome text

   - Navigation links

   ### Trainers List Page
 
   - List of trainer names as hyperlinks

   ### Trainer Details Page

   - Trainer ID, Name, Email, Phone, Technology, Skills
  ## Author
    Name: Sirimavilla Kaushik
    Date: 29-07-2025
    Language Used:ReactJS,Node.js,npm
