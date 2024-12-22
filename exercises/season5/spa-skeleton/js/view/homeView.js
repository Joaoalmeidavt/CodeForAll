function render(onClick) {
    const container = document.querySelector('#container');
    const form = document.createElement('form');
    const div = document.createElement('div');

    div.className = `text-center`;
    form.className = `form`;
    form.type = `form`;
    form.style = `margin-top: 10%; margin-bottom: 10%`;

    form.innerHTML = `
        <label for="location_name">Location: </label>
        <input type="text" id="location_name" name="location_name" placeholder="Name" required>
    
        <button type="submit">Submit</button>
        `;


    div.appendChild(form);

    container.innerHTML = ''; //removes the previous elements

    form.addEventListener('submit', async e => {
        e.preventDefault();

        const location_name = document.getElementById('location_name').value;

        const {
            sunrise,
            sunset,
            day_length,
            zone,
            timeThere
        } = await onClick(location_name);

        const elem = document.createElement('div');
        elem.className = `text-center`;

        elem.innerHTML = `
            <h1 class="title">Dawn to Dusk: ${location_name}</h1>
            <table class="content">
                <tbody>
                    <tr>
                        <td scopw="col">Sunrise: ${sunrise} <i class="fa-solid fa-sun"></i></td>
                        <td scopw="col">Sunset: ${sunset} <i class="fa-solid fa-moon"></i></td>
                        <td scopw="col">Day Length: ${day_length} <i class="fa-solid fa-clock"></i></td>
                        <td scopw="col">Timezone: ${zone} <i class="fa-solid fa-location-crosshairs"></i></td>
                        <td scopw="col">Time: ${timeThere} <i class="fa-solid fa-clock"></i></td>
                    </tr>
                </tbody>
            </table>
        `;

        if (container.childElementCount > 1) {
            container.removeChild(container.lastChild);
        }

        container.appendChild(elem);
    });

    container.appendChild(div);
}

export default { render };
