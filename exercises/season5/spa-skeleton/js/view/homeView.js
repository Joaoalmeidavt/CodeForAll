function render(onClick) {
    const container = document.querySelector('#container');
    const form = document.createElement('form');
    const div = document.createElement('div');

    div.className = `text-center`;
    form.className = `form`;
    form.type = `form`;
    form.style = `margin-top: 10%; margin-bottom: 10%`;

    form.innerHTML = `
        <label for="latitude">Latitude:</label>
        <input type="text" id="latitude" name="latitude" placeholder="Enter latitude" required>
    
        <label for="longitude">Longitude:</label>
        <input type="text" id="longitude" name="longitude" placeholder="Enter longitude" required>
    
        <button type="submit">Submit</button>
        `;


    div.appendChild(form);

    container.innerHTML = ''; //removes the previous elements

    form.addEventListener('submit', async e => {
        e.preventDefault();

        const latitude = document.getElementById('latitude').value;
        const longitude = document.getElementById('longitude').value;

        const {
            sunrise,
            sunset,
            solar_noon,
            day_length,
            civil_twilight_begin,
            civil_twilight_end,
            nautical_twilight_begin,
            nautical_twilight_end,
            astronomical_twilight_begin,
            astronomical_twilight_end
        } = await onClick(latitude, longitude);

        const elem = document.createElement('div');
        elem.className = `text-center`;

        elem.innerHTML = `
            <h1>Sunrise: ${sunrise}</h1>
            <h3>Sunset: ${sunset}</h3>
            <h3>Day Length: ${day_length}</h3>
        `;

        if (container.childElementCount > 1) {
            container.removeChild(container.lastChild);
        }

        container.appendChild(elem);
    });

    container.appendChild(div);
}

export default { render };
