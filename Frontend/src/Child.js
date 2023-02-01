import React from "react";

export default function Child({ valueofProps, changeName }) {
	return (
		<div>
			<h1>{valueofProps}</h1>
			<button onClick={() => changeName("Mayank Negi")}>Change Name</button>
		</div>
	);
}
