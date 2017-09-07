# Test the code using `Postman`

### Generate random contact:
Address: `http://localhost:8080/contact/random`

Header 1: `Accept`:`application/xml`

### Edit generated contat: 
Address: `http://localhost:8080/contact/edit`

Header 1: `Accept`:`application/xml`

Header 2: `Content-Type`:`application/xml`

Body (raw, XML(text/xml)):
```
<contact>
    <id>33</id>
    <version>1</version>
    <firstName>Vladimir</firstName>
    <lastName>Lenin</lastName>
    <birthDate>2017-09-06T19:20:18.668+03:00</birthDate>
</contact>
```