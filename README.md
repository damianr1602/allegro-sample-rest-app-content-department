# allegro-sample-rest-app-content-department
Zadanie stażowe: prosta aplikacja RESTowa z wykorzystaniem Springa(zespół contentu)

Obsugiwane opcje: /films, films/film?id=nr, /add
Przykłady użycia:

/add, metoda POST
http://localhost:8080/add
Body:
{
	"title" : "12 Angry Men",
	"year" : "1957",
	"director" : "Sidney Lumet",
	"genre" : ["Dramat sądowy"]
}

/films, metoda GET
http://localhost:8080/films

/films/film?id=1
http://localhost:8080/films/film?id=1

