import { Component } from "react";
import "./App.css";
import React from "react";
import Student from "./Student";

class App extends Component {
	state = {};
	// const [name, setName] = useState("Mayank");
	// const changeName = (value) => {
	// 	setName(value);
	// }

	render() {
		return <Student />;
	}
}

export default App;
