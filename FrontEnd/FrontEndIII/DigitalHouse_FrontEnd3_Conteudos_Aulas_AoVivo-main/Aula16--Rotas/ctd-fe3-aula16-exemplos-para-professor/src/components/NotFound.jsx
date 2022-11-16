import React from 'react'
import { Link } from 'react-router-dom'

function NotFound() {
    return (
        <div>
            <h1 style={{fontSize: "200px"}}>404</h1>
            <h1 style={{fontSize: "30px"}}>Resource not found!</h1>
            <p style={{ textAlign: "center" }}>
                <Link to="/">Back to Home</Link>
            </p>
        </div>

    );
}

export default NotFound;