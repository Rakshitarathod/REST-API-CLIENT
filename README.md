# REST-API-CLIENT

*COMPANY* : CODETECH IT SOLUTIONS

*NAME* : RAKSHITA RATHOD

*INTERN ID* : CT04DH1485

*DOMAIN* : JAVA PROGRAMMING

*DURATION* : 4 WEEKS

*MENTOR* :NEELA SANTOSH

*DESCRIPTION*

# 🌦️ Java Weather API Client

## 🧾 Project Overview

**Java Weather API Client** is a console-based application built in Java that fetches real-time weather data for any city using the OpenWeatherMap API. It is designed for Java beginners who want to learn how to integrate RESTful APIs, parse JSON responses, and display live data using Java core libraries.

This project takes a **city name as input** and displays current temperature, weather conditions, humidity, wind speed, and country. It demonstrates real-world API consumption using `HttpURLConnection` and `org.json.JSONObject` for JSON parsing.

---

## 🎯 Features

- 🔎 Search weather by city name  
- 🌡️ Get temperature in Celsius  
- 🌥️ Weather description (clear, cloudy, etc.)  
- 💧 Humidity level  
- 🍃 Wind speed  
- 🌍 Country and city display  
- ❌ Error handling for invalid input or API issues

---

## 🛠️ Technologies Used

- Java SE 17+  
- OpenWeatherMap REST API  
- HttpURLConnection for API requests  
- org.json (JSON parsing library)  
- Command Line Interface (CLI)

---

## 🚀 How to Run the Project

### Prerequisites

- Java JDK 17 or above  
- Internet connection  
- OpenWeatherMap API key (free at: https://openweathermap.org/api)  
- JSON library (e.g., `org.json` from https://mvnrepository.com/artifact/org.json/json)

### Steps

1. Download or clone the repository  
2. Open the project in your preferred IDE (IntelliJ, Eclipse, etc.)  
3. Add the `org.json` library to your project classpath or Maven dependency
4. Replace the placeholder API key in the code with your actual API key  
5. Compile and run the `WeatherApiClient.java` file  
6. Enter a city name when prompted

---

## 💡 Example Output

<img width="345" height="247" alt="Image" src="https://github.com/user-attachments/assets/9d599355-b8ea-4edd-9ca3-7c5311df4844" />

---

## 🧠 Learning Outcomes

- Using Java to call external REST APIs  
- Constructing dynamic URLs  
- Reading API response via `BufferedReader`  
- Parsing JSON data using `org.json.JSONObject`  
- Clean console-based interaction using Scanner  
- Effective error handling for user input and API issues

---

## ✅ Benefits

- Simple and beginner-friendly codebase  
- Teaches fundamentals of API integration  
- Can be extended to support 5-day or hourly forecasts  
- No frontend needed – all in console

---


## 🔑 Note

```java
String apiKey = "your_actual_api_key";

