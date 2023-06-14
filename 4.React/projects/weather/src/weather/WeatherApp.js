import { useState } from "react";
import WeatherInfo from "./WeatherInfo";

function WeatherApp() {
    const [cityName, setCityName] = useState("");
    const [weatherData, setWeatherData] = useState({});
    const changeCityInput = (e) => {
        setCityName(e.target.value);
    }

    const fetchWeatherAPI = async () => {
        const APIurl = `https://api.openweathermap.org/data/2.5/weather?q=${cityName}&units=metric&appid=e737f2cc1b10c66d133345a5905b3e6c`
        const resp = await fetch(APIurl);
        const respJson = await resp.json();
        setWeatherData(respJson);

        // const res = await axios.get(APIurl);
        // setWeatherData(res.data);
    }
    
    let handleMouseOut = (e) => {
        fetchWeatherAPI();
    }
    return (
        <>
            <div className="container">
                <div className="row">
                    <div className="col-sm-4">
                        <h3 className="text-center text-success"> React Weather App</h3>
                        <div className="form-group">
                            <input type="text" className="form-control" placeholder="Enter City Name" onChange={changeCityInput} onMouseOut={handleMouseOut} value={cityName} />
                        </div>
                        {/* Weather app info*/}
                        <WeatherInfo cityName={cityName} weatherData={weatherData} />
                        {/* Weather app info*/}
                    </div>

                </div>
            </div>
        </>

    );
}

export default WeatherApp;