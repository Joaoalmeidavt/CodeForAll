async function getTimes(lat, lng) {
    const api_url = 'https://api.sunrise-sunset.org/json?lat=41.1621602&lng=-8.7043535';
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

export default { getTimes };
