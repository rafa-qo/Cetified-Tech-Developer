import { useState } from 'react';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from './pages/Home';
import Contact from './pages/Contact';
import Page404 from './pages/404';
import Details from './pages/Details';


const RoutesConfig = ()=> {
  return (
    <BrowserRouter>
      <Routes>
        <Route path='/' element={<Home />}/>
        <Route path='/contact' element={<Contact />}/>
        <Route path='/details/:nome' element={<Details />}/>
        {/* <Route path='/details' element={<Details />}/> */}
        <Route path='*' element={<Page404 />}/>
      </Routes>
    </BrowserRouter>
  )
};


export default RoutesConfig
