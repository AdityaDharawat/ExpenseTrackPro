# 💼 Enterprise Expense Management System (Frontend)

## ✨ Overview

The **Enterprise Expense Management System** is a modern, responsive, and scalable web application designed for companies to efficiently track, manage, and analyze employee expenses.  
This project implements a fully professional frontend using **React.js** with **Vite**, styled with **Material UI**, and follows best practices for modularity, security, and responsiveness.

Followed by the product illustration:
![Screenshot 2025-05-20 121527](https://github.com/user-attachments/assets/2ccef3c5-67a1-498f-beb2-9894e5407fca)
![Screenshot 2025-05-20 121606](https://github.com/user-attachments/assets/484549b0-a4fe-44bb-b1d0-dbad769be1c1)
![Screenshot 2025-05-20 121618](https://github.com/user-attachments/assets/5001bdf6-d517-487b-a631-37446a67bc02)
![Screenshot 2025-05-20 121632](https://github.com/user-attachments/assets/68ba001d-943f-45f5-8f7c-ec1fbbe7809c)
![Screenshot 2025-05-20 121646](https://github.com/user-attachments/assets/2d0a476e-08d5-4647-89ef-339729a47b06)
![Screenshot 2025-05-20 121905](https://github.com/user-attachments/assets/37c7c57c-9853-4a90-a296-47c319764e58)


---

## 🚀 Key Features

### 👥 User Management
- Secure login page (development mode allows any credentials).
- Role-based access control (Employee, Manager, Admin).
- Role-specific dashboards and page access.

### 🧾 Expense Management
- Submit new expenses with invoice upload (images, PDFs).
- View, edit, and delete expenses.
- Categorization of expenses (Travel, Food, Office Supplies, etc.).

### ✅ Approval Workflow
- Manager and Finance level approvals.
- Multi-stage approval tracking and status updates.
- Notifications for approvals and rejections.

### 📊 Analytics & Reporting
- Interactive charts displaying monthly and yearly expense trends.
- Category-wise expense breakdown.
- Export options for reports (Excel/PDF simulation).

### 🌟 Premium Upgrade (Exclusive)
- Premium plans page with upgrade options.
- Payment gateway integration (Stripe Checkout or Razorpay simulation).
- Access to exclusive features like advanced analytics, dark mode, and real-time tracking after upgrading.

### 🛠️ Additional Enhancements
- Modern, minimalistic, mobile-first UI.
- Smooth page transitions and hover animations.
- Toast notifications for user actions.
- Skeleton loaders during data fetches.
- Fully protected routes using authentication tokens.

---

## 🛠️ Tech Stack

- **React.js** (Vite setup)
- **Material UI (MUI)** for styling
- **Redux Toolkit** for state management
- **React Router DOM** for routing
- **Axios** for API communication
- **Chart.js** for data visualization
- **Framer Motion** for animations (optional)
- **Stripe/Razorpay SDKs** for payment integration (optional)

---

## 🗂️ Folder Structure

```
src/
 ├── api/             # Axios instances and service modules
 ├── auth/            # Authentication context or hooks
 ├── components/      # Reusable UI components
 ├── features/        # Redux slices
 ├── hooks/           # Custom React hooks
 ├── layouts/         # Application layout wrappers
 ├── pages/           # Application pages
 ├── routes/          # Route guards and route configs
 ├── utils/           # Helper functions and validators
 ├── App.jsx          # Root component
 └── main.jsx         # Application entry point
```

---

## ⚙️ Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/enterprise-expense-management-frontend.git
   ```

2. **Navigate to the project directory**
   ```bash
   cd enterprise-expense-management-frontend
   ```

3. **Install dependencies**
   ```bash
   npm install
   ```

4. **Start the development server**
   ```bash
   npm run dev
   ```

5. **Environment Variables**
   
   Create a `.env` file at the root level and configure:
   ```
   VITE_API_BASE_URL=http://localhost:8080/api
   ```

   (Adjust the backend URL once backend service is ready.)

---

## 🧩 Development Notes

- The authentication currently accepts any credentials for easier frontend testing.
- Payment integration is simulated; you can connect real Stripe keys when backend is available.
- All dynamic data is prepared to be integrated with live backend APIs.
- Placeholder mock data is used for initial testing (expenses, users, approvals).

---

## 🔮 Future Enhancements

- Real API integration with Spring Boot backend.
- Production build optimization (tree shaking, lazy loading).
- Real-time updates using WebSockets.
- Full Progressive Web App (PWA) support.

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).


