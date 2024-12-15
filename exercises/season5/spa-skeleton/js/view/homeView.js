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
            solar_noon,
            day_length,
            civil_twilight_begin,
            civil_twilight_end,
            nautical_twilight_begin,
            nautical_twilight_end,
            astronomical_twilight_begin,
            astronomical_twilight_end
        } = await onClick(location_name);

        const elem = document.createElement('div');
        elem.className = `text-center`;

        elem.innerHTML = `
            <table class="content">
                <tbody>
                    <tr>
                        <td scopw="col">Sunrise: ${sunrise} <i class="fa-solid fa-sun"></i></td>
                        <td scopw="col">Sunset: ${sunset} <i class="fa-solid fa-moon"></i></td>
                        <td scopw="col">Day Length: ${day_length} <i class="fa-solid fa-clock"></i></td>
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
