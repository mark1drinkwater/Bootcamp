const url = "people.json";
const response = fetch(url);

response
    .then(response => response.json())
    .then(data => {
        data.forEach(person => {
            for (attribute in person) {
                console.log(attribute, ":", person[attribute]);
            }
        });
    })
