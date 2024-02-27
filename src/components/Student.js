import * as React from "react";
import Box from "@mui/material/Box";
import TextField from "@mui/material/TextField";
import { Button, Container, Paper, paperClasses } from "@mui/material";
import { useState } from "react";

export default function Student() {
	const [name, setName] = useState("");
	const [address, setAddress] = useState("");

	const handleClick = (e) => {
		const student = { name, address };
		fetch("http://localhost:8080/student/add", {
			method: "POST",
			headers: { "Content-Type": "application/json" },
			body: JSON.stringify(student),
		}).then(() => {
			console.log("new student added");
		});
	};

	const paperStyle = { padding: "50px 20px", width: 600, margin: "20px auto" };
	return (
		<Container>
			<h1 color="Blue">
				<u>Add Student</u>
			</h1>
			<Paper elevation={3} style={paperStyle}>
				<Box
					component="form"
					sx={{
						"& > :not(style)": { m: 1 },
					}}
					noValidate
					autoComplete="off">
					<TextField id="outlined-basic" label="Student Name" variant="outlined" fullWidth value={name} onChange={(e) => setName(e.target.value)} />
					<TextField id="outlined-basic" label="Address" variant="outlined" fullWidth value={address} onChange={(e) => setAddress(e.target.value)} />
					<Button variant="contained" onClick={handleClick}>
						Submit
					</Button>
				</Box>
			</Paper>
		</Container>
	);
}
