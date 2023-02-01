import React, { useState } from "react";
import axios from "axios";
function Student() {
	const [name, setName] = useState("");
	const [cnum, setCnum] = useState();
	const [marks, setMarks] = useState();
	const getStudentData = () => {
		axios
			.get("http://localhost:8095/studentDetails")
			.then((response) => {
				setName(response.data[0].name);
				setCnum(response.data[0].contact);
				setMarks(response.data[0].marks);
			})
			.catch((error) => console.log(error));
	};
	getStudentData();
	return (
		<div>
			<table>
				<tr>
					<th>Student name</th>
					<th>Contact number</th>
					<th>Marks</th>
				</tr>
				<tr>
					<td>{name}</td>
					<td>{cnum}</td>
					<td>{marks}</td>
				</tr>
			</table>
		</div>
	);
}

export default Student;
