import React, { Component } from 'react';

class About extends Component {
    constructor(props) {
        super(props)
    }

    render() {
        return (
            <div>
                <h1>About</h1>
                <p>This website is about learning react!</p>
                <br></br>
                <img src="https://www.freecodecamp.org/news/content/images/size/w2000/2022/04/featured.jpg" alt="React" />
            </div>
        );
    }
}

export default About;