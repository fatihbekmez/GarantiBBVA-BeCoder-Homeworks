--Tablo oluşturma
CREATE TABLE country(
	id_country SERIAL PRIMARY KEY,
	country_name VARCHAR(25) NOT NULL
);

CREATE TABLE leauge(
	id_leauge SERIAL PRIMARY KEY,
	leaueg_name VARCHAR(50) NOT NULL,
	id_country INT NOT NULL,
	FOREIGN KEY (id_country) REFERENCES country (id_country)	
);

CREATE TABLE team(
	id_team SERIAL PRIMARY KEY,
	team_name VARCHAR(50) NOT NULL,
	est_year INT NOT NULL,
	out_goal INT NOT NULL,
	in_goal INT NOT NULL,
	team_point INT NOT NULL,
	grade INT NOT NULL	
);

CREATE TABLE player(
	id_player SERIAL PRIMARY KEY,
	player_name VARCHAR(50) NOT NULL,
	player_surname VARCHAR(30) NOT NULL,
	FOREIGN KEY (id_team) REFERENCES team (id_team),
	FOREIGN KEY (id_country) REFERENCES country (id_country),
	goal INT NOT NULL,
);

--Insert Script

INSERT INTO country (country_name) VALUES
('Türkiye'),
('Grecee'),
('Netherlands'),
('Germany'),
('BEA'),
('Spain'),
('Italy'),
('Argentina'),
('Brazil'),
('Portugueses');


INSERT INTO leauge (leauge_name, id_country) VALUES
('Süper Lig',1 ),
('Super Leauge',2 ),
('Eredivise',3 ),
('Bundesliga',4 ),
('BEA Pro Leauge',5 ),
('La Liga',6 ),
('Seria A',7 );

INSERT INTO team (team_name, est_year, out_goal, in_goal, team_point, grade) VALUES
('Galatasaray', 1905, 10, 20, 40, 1),
('Adana Demir Spor', 1940, 10, 15, 34,1),
('AEK', 1924, 30, 10, 36, 1),
('Feyenoord', 1908, 16, 8, 20, 1),
('Bayern Munich', 1900, 5, 30, 30, 1),
('Al-Nasr',1955, 40, 10, 20, 1),
('Barcelona', 1926, 34, 40,48,1),
('Juventus', 1897, 4, 20, 34, 1);

INSERT INTO player (player_name, player_surname, id_team, id_country, goal ) VALUES
('Mauro', 'Icardi', 1, 8, 30 ),
('Kerem', 'Aktürk', 1, 1, 4),
('Pablo','Gavi', 7, 6, 6),
('Arthur', 'Melo', 8, 9, 3),
('Cristiano', 'Ronaldo',6, 10, 20),
('Manuel','Neuer',5,4,0);

--Türkiye Ligi Listeleme
SELECT leauge_name FROM leauge
INNER JOIN country ON leauge.id_country = country.id_country
WHERE name_country = ‘Türkiye';

--Super lig lider listeleme
SELECT team_name, team_point FROM team
JOIN leauge ON team.id_league = id_league
JOIN country ON leauge.id_country = id_country
WHERE country.name = 'Türkiye' AND league.grade = 1
ORDER BY team.team_point DESC;

--Süper lig puan ortalaması
SELECT AVG(team_point) FROM team
WHERE leauge_id = 1;

--Gol Kralı Listeleme
SELECT player_name, player_surname, player.id_team, player.id_country FROM team
JOIN team ON player_id.team = id_team
JOIN leauge ON team.id_leauge = id_leauge
ORDER BY goal DESC
LIMIT = 1;

--Averaj Listeleme
SELECT * FROM team
WHERE team in_goal < out_goal;







