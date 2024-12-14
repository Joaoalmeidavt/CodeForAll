function render(onClick) {
    const container = document.querySelector('#container');
    const button = document.createElement('button');
    const div = document.createElement('div');

    div.className = `text-center`;
    button.className = `btn btn-primary`;
    button.type = `button`;
    button.style = `margin-top: 10%; margin-bottom: 10%`;

    div.appendChild(button);

    container.innerHTML = ''; //removes the previous elements
    button.innerText = `CLICK ME FOR RANDOM MOVIE`;

    button.addEventListener('click', async e => {
        e.preventDefault();

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
        } = await onClick(parseInt(Math.random() * 6));

        const elem = document.createElement('div');
        elem.className = `text-center`;

        elem.innerHTML = `<h1>${sunrise}</h1>
        <h3>${sunset}</h3>
        <h3>${solar_noon}</h3>
        <h3>${day_length}</h3>`;

        if (container.childElementCount > 1) {
            container.removeChild(container.lastChild);
        }

        container.appendChild(elem);
    });

    container.appendChild(div);
}

export default { render };
