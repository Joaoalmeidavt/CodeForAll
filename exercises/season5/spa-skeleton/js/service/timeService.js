async function getTimes(location_name) {
    const {lat, lon} = await getCoords(location_name);

    const api_url = `https://api.sunrise-sunset.org/json?lat=${lat}&lng=${lon}`;
    try {
        const response = await fetch(api_url);
        if (!response.ok) {
            throw new Error(`HTTP error! Status: ${response.status}`);
        }
        const data = await response.json();
        if (!data.results) {
            throw new Error('No results found');
        }
        return data.results;
    } catch (error) {
        console.error('Error fetching data:', error);
        return null;
    }
}

// OpenStreetMap Nominatim API
// https://nominatim.openstreetmap.org/search?q=Porto&format=json

async function getCoords(location_name){
    const api_url = `https://nominatim.openstreetmap.org/search?q=${location_name}&format=json`;
    try {
        const response = await fetch(api_url);

        if(!response.ok){
            throw new Error(`HTTP error! Status: ${response.status}`);
        }

        const data = await response.json();
        if (!data) {
            throw new Error('No results found');
        }

        const lat = data[0].lat;
        const lon = data[0].lon;
        return {lat, lon};
    } catch (error) {
        console.error('Error fetching data:', error);
        return null;
    }
}

export default { getTimes };
