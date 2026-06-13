import requests

url = 'https://api.upstox.com/v2/fundamentals/INE839G01010/competitors'
headers = {
    'Accept': 'application/json',
    'Authorization': 'Bearer eyJ0eXAiOiJKV1QiLCJrZXlfaWQiOiJza192MS4wIiwiYWxnIjoiSFMyNTYifQ.eyJzdWIiOiI3RUFIQkoiLCJqdGkiOiI2OWNiNzY3NDBiMWUyZTJmOTIyM2Q3NjAiLCJpc011bHRpQ2xpZW50IjpmYWxzZSwiaXNQbHVzUGxhbiI6dHJ1ZSwiaXNFeHRlbmRlZCI6dHJ1ZSwiaWF0IjoxNzc0OTQxODEyLCJpc3MiOiJ1ZGFwaS1nYXRld2F5LXNlcnZpY2UiLCJleHAiOjE4MDY1MzA0MDB9.o4wIUGP8k796FEgbNWAdsoh0WngE1VDXqCZ4xJDj4iM'
}

response = requests.get(url, headers=headers)
print(response.json())
