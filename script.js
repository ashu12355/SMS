async function getStudent() {
    const response = await fetch(`http://localhost:1001/student`);
    const student = await response.json();
    
    document.body.innerHTML = `
        <dl>
        <dd>${student.name}</dd>
        <dd>${student.roll}</dd>
        <dd>${student.fee}</dd>
        <dd>Hobbies: ${student.hobbies.join(", ")}</dd>
        <dd>${student.address.city}</dd>
        <dd>${student.address.state}</dd>
        
        
        </dl> `
    
}

getStudent();