# Thornadus Events
Save easily your events with Thornadus

### Download
> $ git clone https://github.com/guzman6001/thornadusevents.git

### Install & Run
Spring Initializr uses maven wrapper so type this:
> $ ./mvnw clean spring-boot:run

Alternatively using your installed maven version type this:
> $ mvn clean spring-boot:run

When the app starts, we can use Postman to test the services provided.

### Services

##### Create
Create a new event all all fields are mandatory.
- Endpoint
> localhost:8084/api/events
- Method **POST**
- Example request
>```
>{
>  "id": null,
>  "title": "Thornadus Party",
>  "description": "We will celebrate a big crazy wild party.",
>  "startDate": "2022-07-25T21:00:00.000+00:00",
>  "endDate": "2022-07-26T07:00:00.000+00:00"
>}
>```

##### Read / List
Read the event identified by [ID]. Optionaly if [ID] is not sent it will return all events. 
- Endpoint
> localhost:8084/api/events/[ID]
- Method **GET**

##### Update
Update/Edit the event identified by [ID]. Returns the event updated. [ID] is mandatory.
- Endpoint
> localhost:8084/api/events/**[ID]**
- Method **PUT**
- Example request
>```
>{
>  "id": 1,
>  "title": "Thornadus Party",
>  "description": "We will celebrate a big code party, with coffee and some cookies.",
>  "startDate": "2022-07-25T21:00:00.000+00:00",
>  "endDate": "2022-07-26T23:00:00.000+00:00"
>}
>```

##### Delete
Delete the event identified by [ID]. Returns the event deleted.
- Endpoint
> localhost:8084/api/events/**[ID]**
- Method **DELETE**






