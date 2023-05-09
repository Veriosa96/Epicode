import "bootstrap/dist/css/bootstrap.min.css";
import './App.css';
import { BrowserRouter,Routes,Route } from 'react-router-dom';
//import sideBar from './components/sideBar/sideBar';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
      <loginPage/>
      <Routes>
      <navBar/>
        <Route path="/" element={<homePage/>}/>
        <Route path="/" element={<sideBar/>}/>
        <Route path="/" element={<footer/>}/>
      </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
