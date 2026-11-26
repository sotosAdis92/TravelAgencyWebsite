/*
INSERT INTO Continent(name,population,land_area,picture,map,created_at,updated_at);
VALUES('EUROPE',743478518,10186000,'','',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
INSERT INTO Continent(name,population,land_area,image_url,map_url,created_at,updated_at);
VALUES('ASIA',4873357812,44000001,'','',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
INSERT INTO Continent(name,population,land_area,image_url,map_url,created_at,updated_at);
VALUES('SOUTH_AMERICA',441457405,17840000,'','',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
INSERT INTO Continent(name,population,land_area,image_url,map_url,created_at,updated_at);
VALUES('OCEANIA',47306404,9000000,'','',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
INSERT INTO Continent(name,population,land_area,image_url,map_url,created_at,updated_at);
VALUES('NORTH_AMERICA_AND_CENTRAL_AMERICA_AND_CARIBBEAN',621780000,24709000,'','',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
INSERT INTO Continent(name,population,land_area,image_url,map_url,created_at,updated_at);
VALUES('AFRICA',1393676444,30300000,'','',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
INSERT INTO Continent(name,population,land_area,image_url,map_url,created_at,updated_at);
VALUES('ANTARCTICA',0,14200000,'','',CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
INSERT INTO Continent(name,population,land_area,image_url,map_url,created_at,updated_at);
*/
/*
INSERT INTO Country(name, population, continent_id, country_picture, country_map, created_at, updated_at)
VALUES
('Albania', 2793595, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Andorra', 79877, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Austria', 9104772, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Belarus', 9200000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Belgium', 11754000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Bosnia and Herzegovina', 3200000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Bulgaria', 6440000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Croatia', 3850000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Cyprus', 1240000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Czech Republic', 10700000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Denmark', 5930000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Estonia', 1330000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Finland', 5560000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('France', 68000000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Germany', 84400000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Greece', 10300000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Hungary', 9600000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Iceland', 380000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Ireland', 5200000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Italy', 58900000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Latvia', 1830000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Liechtenstein', 39000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Lithuania', 2860000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Luxembourg', 660000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Malta', 540000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Moldova', 2500000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Monaco', 39000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Montenegro', 620000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Netherlands', 17900000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('North Macedonia', 1830000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Norway', 5500000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Poland', 36800000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Portugal', 10600000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Romania', 18800000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Russia', 144000000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('San Marino', 33000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Serbia', 6600000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Slovakia', 5400000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Slovenia', 2100000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Spain', 48400000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Sweden', 10500000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Switzerland', 8800000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Ukraine', 36000000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('United Kingdom', 67800000, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Vatican City', 800, 1, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('China', 1412000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('India', 1428000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Japan', 123000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('South Korea', 51700000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Indonesia', 279000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Pakistan', 240000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Bangladesh', 173000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Vietnam', 99000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Thailand', 71000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Myanmar', 54000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Malaysia', 34000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Philippines', 117000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Cambodia', 17000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Laos', 7500000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Mongolia', 3400000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Nepal', 30000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Bhutan', 780000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Sri Lanka', 22000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Kazakhstan', 19000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Uzbekistan', 35000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Turkmenistan', 6300000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Kyrgyzstan', 6700000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Tajikistan', 9900000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Afghanistan', 42000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Iran', 88000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Iraq', 44000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Saudi Arabia', 36000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Yemen', 34000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Oman', 4600000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('United Arab Emirates', 10000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Qatar', 2700000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Kuwait', 4300000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Bahrain', 1500000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Jordan', 11000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Lebanon', 5400000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Syria', 22000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Israel', 9700000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Turkey', 85000000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Georgia', 3700000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Armenia', 2800000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Azerbaijan', 10100000, 2, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Brazil', 216000000, 4, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Argentina', 46000000, 4, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Colombia', 52000000, 4, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Peru', 34000000, 4, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Venezuela', 28000000, 4, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Chile', 19600000, 4, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Ecuador', 18000000, 4, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Bolivia', 12000000, 4, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Paraguay', 6800000, 4, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Uruguay', 3400000, 4, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Guyana', 800000, 4, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Suriname', 620000, 4, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Australia', 26000000, 5, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('New Zealand', 5200000, 5, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Fiji', 930000, 5, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Papua New Guinea', 10000000, 5, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Egypt', 110000000, 9, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Nigeria', 220000000, 9, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('South Africa', 60000000, 9, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Kenya', 55000000, 9, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Ethiopia', 123000000, 9, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
('Antarctica',0, 6, '', '', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
*/
/*
INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1890, 'Discover the magic of Italy',8,'/','/',6,'ANY','Italy - Rome - Florence - Venice',FALSE,20,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 2450, 'Discover the magic of Italy',11,'/','/',9,'ANY','Italy - Rome - Naples - Amalfi Coast - Sicily',FALSE,20,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 2790, 'Discover the magic of Italy',12,'/','/',10,'GOOD','Italy - Dolomites - Tuscany - Cinque Terre',FALSE,20,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1650, 'Discover the magic of France',7,'/','/',5,'ANY','France - Paris - Versailles - Loire Valley',FALSE,14,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 2290, 'Discover the magic of France',10,'/','/',8,'ANY','France - Paris - Provence - French Riviera',FALSE,14,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1980, 'Discover the magic of Spain',8,'/','/',6,'ANY','Spain - Madrid - Toledo - Seville - Granada',FALSE,40,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 2540, 'Discover the magic of Spain',11,'/','/',9,'ANY','Spain - Barcelona - Valencia - Andalusia',FALSE,40,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1850, 'Discover the magic of Portugal',7,'/','/',5,'ANY','Portugal - Lisbon - Sintra - Porto',FALSE,33,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1390, 'Discover the magic of Greece',6,'/','/',4,'ANY','Greece - Athens - Delphi - Meteora',FALSE,16,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 2190, 'Discover the magic of Greece',10,'/','/',8,'GOOD','Greece - Athens - Mykonos - Santorini - Crete',FALSE,16,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 2090, 'Discover the magic of Germany',8,'/','/',6,'ANY','Germany - Berlin - Dresden - Munich',FALSE,15,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 2990, 'Discover the magic of Germany',11,'/','/',9,'ANY','Germany - Bavaria - Black Forest - Rhine Valley',FALSE,15,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 2490, 'Discover the magic of the United Kingdom',9,'/','/',7,'ANY','United Kingdom - London - Oxford - Cambridge',FALSE,44,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 3290, 'Discover the magic of the United Kingdom',12,'/','/',10,'GOOD','United Kingdom - London - Edinburgh - Scottish Highlands',FALSE,44,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 2150, 'Discover the magic of the Netherlands',7,'/','/',5,'ANY','Netherlands - Amsterdam - Tulips - Windmills',FALSE,29,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1890, 'Discover the magic of Austria',7,'/','/',5,'ANY','Austria - Vienna - Salzburg - Hallstatt',FALSE,3,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 2590, 'Discover the magic of Switzerland',9,'/','/',7,'GOOD','Switzerland - Zurich - Interlaken - Zermatt',FALSE,42,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1490, 'Discover the magic of Czech Republic',6,'/','/',4,'ANY','Czech Republic - Prague - Bohemia',FALSE,10,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1790, 'Discover the magic of Croatia',7,'/','/',5,'ANY','Croatia - Zagreb - Dubrovnik - Split',FALSE,8,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 2390, 'Discover the magic of Croatia',10,'/','/',8,'GOOD','Croatia - Dalmatian Coast - Islands',FALSE,8,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1290, 'Discover the magic of Hungary',5,'/','/',3,'ANY','Hungary - Budapest - Danube Bend',FALSE,17,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1990, 'Discover the magic of Scandinavia',9,'/','/',7,'GOOD','Denmark - Copenhagen - Aarhus',FALSE,11,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 2890, 'Discover the magic of Scandinavia',12,'/','/',10,'GOOD','Sweden - Stockholm - Gothenburg - Lapland',FALSE,41,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 3290, 'Discover the magic of Norway',13,'/','/',10,'GOOD','Norway - Oslo - Bergen - Fjords',FALSE,31,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 2690, 'Discover the magic of Iceland',9,'/','/',7,'GOOD','Iceland - Reykjavik - Golden Circle - Glaciers',FALSE,18,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1490, 'Discover the magic of Turkey',8,'/','/',6,'ANY','Turkey - Istanbul - Cappadocia',FALSE,83,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 2190, 'Discover the magic of Turkey',11,'/','/',9,'GOOD','Turkey - Istanbul - Cappadocia - Ephesus - Pamukkale',FALSE,83,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1290, 'Discover the magic of Thailand',8,'/','/',6,'ANY','Thailand - Bangkok - Chiang Mai',FALSE,54,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1790, 'Discover the magic of Thailand',11,'/','/',9,'ANY','Thailand - Bangkok - Phuket - Phi Phi Islands',FALSE,54,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1390, 'Discover the magic of Vietnam',9,'/','/',7,'ANY','Vietnam - Hanoi - Halong Bay - Hoi An',FALSE,53,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1890, 'Discover the magic of Vietnam',12,'/','/',10,'ANY','Vietnam - Hanoi - Hue - Hoi An - Ho Chi Minh',FALSE,53,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1590, 'Discover the magic of Indonesia',9,'/','/',7,'ANY','Indonesia - Bali - Ubud - Uluwatu',FALSE,50,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 2290, 'Discover the magic of Indonesia',13,'/','/',10,'GOOD','Indonesia - Java - Bali - Lombok',FALSE,50,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1190, 'Discover the magic of India',8,'/','/',6,'ANY','India - Delhi - Agra - Jaipur (Golden Triangle)',FALSE,47,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1690, 'Discover the magic of India',12,'/','/',9,'GOOD','India - Kerala - Backwaters - Beaches',FALSE,47,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1890, 'Discover the magic of South Korea',8,'/','/',6,'ANY','South Korea - Seoul - Busan - Jeju Island',FALSE,49,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1090, 'Discover the magic of Morocco',7,'/','/',5,'ANY','Morocco - Marrakech - Casablanca - Fez',FALSE,105,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1590, 'Discover the magic of Morocco',10,'/','/',8,'GOOD','Morocco - Marrakech - Sahara Desert - Atlas Mountains',FALSE,105,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1290, 'Discover the magic of Egypt',8,'/','/',6,'ANY','Egypt - Cairo - Pyramids - Nile Cruise',FALSE,103,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1790, 'Discover the magic of Egypt',11,'/','/',9,'ANY','Egypt - Cairo - Luxor - Aswan - Red Sea',FALSE,103,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1490, 'Discover the magic of South Africa',8,'/','/',6,'ANY','South Africa - Cape Town - Winelands - Safari',FALSE,105,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 2490, 'Discover the magic of South Africa',13,'/','/',10,'GOOD','South Africa - Cape Town - Garden Route - Kruger Safari',FALSE,105,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1690, 'Discover the magic of Kenya',9,'/','/',7,'GOOD','Kenya - Nairobi - Masai Mara Safari',FALSE,106,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 2290, 'Discover the magic of Kenya',12,'/','/',9,'GOOD','Kenya - Masai Mara - Amboseli - Diani Beach',FALSE,106,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1590, 'Discover the magic of Mexico',9,'/','/',7,'ANY','Mexico - Mexico City - Teotihuacan - Oaxaca',FALSE,3,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 2090, 'Discover the magic of Mexico',12,'/','/',10,'ANY','Mexico - Cancun - Riviera Maya - Chichen Itza',FALSE,3,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1890, 'Discover the magic of Costa Rica',8,'/','/',6,'GOOD','Costa Rica - San Jose - Arenal - Monteverde',FALSE,3,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 1990, 'Discover the magic of Australia',10,'/','/',8,'ANY','Australia - Sydney - Melbourne - Great Ocean Road',FALSE,99,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 2890, 'Discover the magic of Australia',14,'/','/',11,'GOOD','Australia - Sydney - Uluru - Great Barrier Reef',FALSE,99,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);

INSERT INTO Trip(capacity,category,cost,description,duration,map_image,picture,nights,physical_condition,title,visa_required,country_id,created_at,updated_at)
VALUES (20,'GROUP', 2390, 'Discover the magic of New Zealand',12,'/','/',10,'GOOD','New Zealand - Auckland - Rotorua - Queenstown',FALSE,100,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
*/