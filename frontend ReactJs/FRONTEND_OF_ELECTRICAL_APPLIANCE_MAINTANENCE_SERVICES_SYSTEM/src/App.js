import React from 'react';
import './App.css';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import HomePage from './components/HomePage';
import SignInPage from './components/SignInPage';
import SignInPageVendor from './components/SignInPageVendor';
import RegistrationPage from './components/RegistrationPage';
import RegistrationPageVendor from './components/RegistrationPageVendor';
import ForgotPasswordPage from './components/ForgotPasswordPage';
import AboutUsPage from './components/AboutUsPage';
import ContactUsPage from './components/ContactUsPage';
function App() {
  return (
        
        <Routes>
        <Route path="/" exact element={<HomePage />} />
        <Route path="/AboutUsPage" element={<AboutUsPage />} />
        <Route path="/ContactUsPage" element={<ContactUsPage />} />
        <Route path="/RegistrationPage" element={<RegistrationPage />} />
        <Route path="/RegistrationPageVendor" element={<RegistrationPageVendor />} />
        <Route path="/SignInPage" element={<SignInPage />} />
        <Route path="/SignInPageVendor" element={<SignInPageVendor />} />
        <Route path="/ForgotPasswordPage" element={<ForgotPasswordPage />} />
        </Routes>
        
   
  );
}

export default App;
