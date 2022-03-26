import logo from '../logo.svg';
import {NavLink} from "react-router-dom";


export default function navBar() {
    return (
        <nav className="navbar navbar-expand navbar-dark bg-dark">
            <a href="" className="navbar-brand ms-1">
                <img src={logo} className="App-logo" alt="logo" />
                React
            </a>
            <div className="navbar-nav me-auto">
                <li className="nav-item">
                    <NavLink to={"/admin"}>Admin</NavLink>
                </li>
                <li className="nav-item">
                    <NavLink to={"/home"}>Home</NavLink>
                </li>
            </div>

            <div className="navbar-nav ms-auto">
                <li className="nav-item">
                    <NavLink to="/register" className="nav-link">
                        Sign Up
                    </NavLink>
                </li>
                <li className="nav-item">
                    <NavLink to="/login" className="nav-link">
                        Sign In
                    </NavLink>
                </li>
            </div>
        </nav>
    )
}