INSERT INTO SAGA (ID, NAME) VALUES (1, 'Saga 1');
INSERT INTO SAGA (ID, NAME) VALUES (2, 'Saga 2');
INSERT INTO SAGA (ID, NAME) VALUES (3, 'Saga 3');
INSERT INTO SAGA (ID, NAME) VALUES (4, 'Saga 4');
INSERT INTO SAGA (ID, NAME) VALUES (5, 'Saga 5');
INSERT INTO SAGA (ID, NAME) VALUES (26, 'Saga 26');
INSERT INTO SAGA (ID, NAME) VALUES (37, 'Saga 37');
INSERT INTO SAGA (ID, NAME) VALUES (18, 'Saga 18');
INSERT INTO SAGA (ID, NAME) VALUES (12, 'Saga 12');
INSERT INTO SAGA (ID, NAME) VALUES (9, 'Saga 9');


INSERT INTO VIDEOGAME (ID, TITLE, SAGA_ID) VALUES
(1, 'Aether Chronicles: Rise of the Phoenix', NULL),
(2, 'Nebulas Descent: Awakening', 1),
(3, 'Whispers of the Void: Echoes', 1),
(4, 'Titans of the Ancients: Reawakened', 1),
(5, 'Temporal Quest: Nexus of Destiny', 4),
(6, 'Mist of the Forgotten: Haunting Shadows', 5),
(7, 'Abyssal Depths: Leviathans Call', 2),
(8, 'Warriors of Fate: Twilight Vanguard', 2),
(9, 'Pandemic Zone: Survivors Escape', 3),
(10, 'Explorers Saga: Hidden Realms', NULL),
(11, 'Relic Hunter: Curse of the Emerald Eye', 9),
(12, 'Infernos Ascent: Rekindled Fury', NULL),
(13, 'Galactic Marines: Stellar Conflict', NULL),
(14, 'Destinys Edge: Chronicles of Fate', NULL),
(15, 'Cosmic Empires: Twilight of the Overlords', NULL),
(16, 'Nether Realms: Siege of Shadows', NULL),
(17, 'Mythic Realms: Ascension', NULL),
(18, 'Eternal Battlefront: Rise of the Phoenix', NULL),
(19, 'Arcane Realms Online: Siege of the Sorcerer', 12),
(20, 'Wasteland Chronicles: Edge of Survival', 12);




INSERT INTO PROMOTION ( ID ,VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (1,'2023-07-06T20:12:14.140Z','9.99' ,1 );
INSERT INTO PROMOTION ( ID ,VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (2,'2023-04-05T20:47:45.356Z','19.99',2 );
INSERT INTO PROMOTION ( ID ,VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (3,'2023-05-08T19:25:03.794Z','29.99',3 );
INSERT INTO PROMOTION ( ID ,VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (4,'2023-03-24T19:50:43.583Z','39.99',4 );
INSERT INTO PROMOTION ( ID ,VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (5,'2023-01-31T04:49:44.832Z','14.99',5 );
INSERT INTO PROMOTION ( ID ,VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (6,'2023-09-20T17:52:59.305Z','29.99',6 );
INSERT INTO PROMOTION ( ID ,VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (7,'2023-11-25T16:47:25.572Z','49.99',7 );
INSERT INTO PROMOTION ( ID ,VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (8,'2023-12-15T22:16:09.176Z','89.99',8 );
INSERT INTO PROMOTION ( ID ,VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (9,'2023-11-24T14:46:01.773Z','89.99',9 );
INSERT INTO PROMOTION ( ID ,VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (10,'2023-11-06T20:12:14.140Z','20.99',10 );
INSERT INTO PROMOTION ( ID ,VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (11,'2023-10-05T20:47:45.356Z','39.99',11 );
INSERT INTO PROMOTION ( ID ,VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (12,'2023-09-08T19:25:03.794Z','19.99',12 );
INSERT INTO PROMOTION ( ID ,VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (13,'2023-08-24T19:50:43.583Z','29.99',13 );
INSERT INTO PROMOTION ( ID ,VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (14,'2023-07-31T04:49:44.832Z','24.99',14 );
INSERT INTO PROMOTION ( ID ,VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (15,'2023-05-20T17:52:59.305Z','49.99',15 );
INSERT INTO PROMOTION ( ID ,VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (16,'2023-12-11T16:47:25.572Z','59.99',16 );
INSERT INTO PROMOTION ( ID ,VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (17,'2023-04-15T22:16:09.176Z','69.99',17 );
INSERT INTO PROMOTION ( ID ,VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (18,'2023-10-12T14:46:01.773Z','59.99',18 );
INSERT INTO PROMOTION ( ID, VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (19,'2023-11-25T08:30:00.000Z','20.99',19 );
INSERT INTO PROMOTION ( ID, VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (20,'2023-12-25T17:20:00.000Z','39.99',20 );
INSERT INTO PROMOTION ( ID, VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES( 21,'2021-12-12T01:37:30.903Z','19.99',1 );
INSERT INTO PROMOTION ( ID, VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES( 22,'2020-05-26T15:12:14.964Z','29.99',2 );
INSERT INTO PROMOTION ( ID, VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES( 23,'2022-05-22T00:42:36.789Z','24.99',3 );
INSERT INTO PROMOTION ( ID, VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES( 24,'2021-08-12T12:52:18.500Z','49.99',4 );
INSERT INTO PROMOTION ( ID, VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES( 25,'2022-03-05T14:39:57.446Z','59.99',5 );
INSERT INTO PROMOTION ( ID, VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES( 26,'2020-10-21T18:25:59.177Z','69.99',6 );
INSERT INTO PROMOTION ( ID, VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES( 27,'2022-02-16T14:15:44.554Z','59.99',7 );
INSERT INTO PROMOTION ( ID, VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES( 28,'2022-09-04T00:44:42.288Z','9.99' ,8 );
INSERT INTO PROMOTION ( ID, VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES( 29,'2022-08-13T20:09:49.854Z','19.99',9 );
INSERT INTO PROMOTION ( ID, VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (30,'2023-01-15T09:30:00.000Z','29.99',10 );
INSERT INTO PROMOTION ( ID, VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (31,'2022-06-20T14:45:00.000Z','39.99',11 );
INSERT INTO PROMOTION ( ID, VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (32,'2023-04-02T11:20:00.000Z','14.99',12 );
INSERT INTO PROMOTION ( ID, VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (33,'2021-09-18T18:00:00.000Z','29.99',13 );
INSERT INTO PROMOTION ( ID, VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (34,'2022-11-07T23:55:00.000Z','49.99',14 );
INSERT INTO PROMOTION ( ID, VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (35,'2023-03-09T07:10:00.000Z','89.99',15 );
INSERT INTO PROMOTION ( ID, VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (36,'2022-08-26T16:40:00.000Z','89.99',16 );
INSERT INTO PROMOTION ( ID, VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (37,'2021-12-05T12:25:00.000Z','39.99',17 );
INSERT INTO PROMOTION ( ID, VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (38,'2023-06-14T15:50:00.000Z','19.99',18 );
INSERT INTO PROMOTION ( ID, VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (39,'2022-04-27T05:30:00.000Z','29.99',19 );
INSERT INTO PROMOTION ( ID, VALID_FROM ,PRICE,VIDEOGAME_ID ) VALUES (40,'2021-11-02T19:15:00.000Z','24.99',20 );

INSERT INTO STOCK ( ID ,AVAILABILITY , LAST_UPDATED ,VIDEOGAME_ID ) VALUES( 1,true,'2021-12-12T01:37:30.903Z',1);
INSERT INTO STOCK ( ID ,AVAILABILITY , LAST_UPDATED ,VIDEOGAME_ID ) VALUES( 2,false,'2020-05-26T15:12:14.964Z',2);
INSERT INTO STOCK ( ID ,AVAILABILITY , LAST_UPDATED ,VIDEOGAME_ID ) VALUES( 3,true,'2022-05-22T00:42:36.789Z',3);
INSERT INTO STOCK ( ID ,AVAILABILITY , LAST_UPDATED ,VIDEOGAME_ID ) VALUES( 4,false,'2021-08-12T12:52:18.500Z',4);
INSERT INTO STOCK ( ID ,AVAILABILITY , LAST_UPDATED ,VIDEOGAME_ID ) VALUES( 5,false,'2022-03-05T14:39:57.446Z',5);
INSERT INTO STOCK ( ID ,AVAILABILITY , LAST_UPDATED ,VIDEOGAME_ID ) VALUES( 6,true,'2020-10-21T18:25:59.177Z',6);
INSERT INTO STOCK ( ID ,AVAILABILITY , LAST_UPDATED ,VIDEOGAME_ID ) VALUES( 7,false,'2021-02-16T14:15:44.554Z',7);
INSERT INTO STOCK ( ID ,AVAILABILITY , LAST_UPDATED ,VIDEOGAME_ID ) VALUES( 8,false,'2020-09-04T00:44:42.288Z',8);
INSERT INTO STOCK ( ID ,AVAILABILITY , LAST_UPDATED ,VIDEOGAME_ID ) VALUES( 9,true,'2022-08-13T20:09:49.854Z',9);
INSERT INTO STOCK (ID,  AVAILABILITY, LAST_UPDATED, VIDEOGAME_ID) VALUES (10, true, '2023-01-15T09:30:00.000Z', 10);
INSERT INTO STOCK (ID,  AVAILABILITY, LAST_UPDATED, VIDEOGAME_ID) VALUES (11, false, '2022-06-20T14:45:00.000Z', 11);
INSERT INTO STOCK (ID,  AVAILABILITY, LAST_UPDATED, VIDEOGAME_ID) VALUES (12, true, '2023-04-02T11:20:00.000Z', 12);
INSERT INTO STOCK (ID,  AVAILABILITY, LAST_UPDATED, VIDEOGAME_ID) VALUES (13, false, '2021-09-18T18:00:00.000Z', 13);
INSERT INTO STOCK (ID,  AVAILABILITY, LAST_UPDATED, VIDEOGAME_ID) VALUES (14, true, '2022-11-07T23:55:00.000Z', 14);
INSERT INTO STOCK (ID,  AVAILABILITY, LAST_UPDATED, VIDEOGAME_ID) VALUES (15, true, '2023-03-09T07:10:00.000Z', 15);
INSERT INTO STOCK (ID,  AVAILABILITY, LAST_UPDATED, VIDEOGAME_ID) VALUES (16, false, '2022-08-26T16:40:00.000Z', 16);
INSERT INTO STOCK (ID,  AVAILABILITY, LAST_UPDATED, VIDEOGAME_ID) VALUES (17, false, '2021-12-05T12:25:00.000Z', 17);
INSERT INTO STOCK (ID,  AVAILABILITY, LAST_UPDATED, VIDEOGAME_ID) VALUES (18, true, '2023-06-14T15:50:00.000Z', 18);
INSERT INTO STOCK (ID,  AVAILABILITY, LAST_UPDATED, VIDEOGAME_ID) VALUES (19, true, '2022-04-27T05:30:00.000Z', 19);
INSERT INTO STOCK (ID,  AVAILABILITY, LAST_UPDATED, VIDEOGAME_ID) VALUES (20, false, '2021-11-02T19:15:00.000Z', 20);


