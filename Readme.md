# Итоговая аттестация

### 1. Используя команду cat в терминале операционной системы Linux, создать два файла Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и ослы), а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека).

**Выполнение команд**

mkdir final-work

cd final-work/

cat > "domesticAnimal.txt"
+ cat
+ dog
+ hamster

cat > "baggageAnimal.txt"
+ horse
+ donkey
+ camel

cat domesticAnimal.txt baggageAnimal.txt > animals.txt

mv animals.txt humanFriends.txt


![image](https://github.com/PIM89/FinalWork/blob/master/Media/Screenshot_1.jpg)

### 2. Создать директорию, переместить файл туда.

mkdir human-friends

mv humanFriends.txt ./human-friends/

![image](https://github.com/PIM89/FinalWork/blob/master/Media/Screenshot_2.jpg)

### 3. Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.

apt update

apt install -y mysql-server mysql-client

mysql -u root

![image](https://github.com/PIM89/FinalWork/blob/master/Media/Screenshot_3.jpg)

### 4. Установить и удалить deb-пакет с помощью dpkg.

wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb

dpkg -i google-chrome-stable_current_amd64.deb

![image](https://github.com/PIM89/FinalWork/blob/master/Media/Screenshot_4.jpg)

dpkg -r google-chrome-stable

### 5. Выложить историю команд в терминале ubuntu

![image](https://github.com/PIM89/FinalWork/blob/master/Media/Screenshot_5.jpg)

### 6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние животные и вьючные животные, в составы которых в случае домашних животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные войдут: Лошади, верблюды и ослы).

![image](https://github.com/PIM89/FinalWork/blob/master/Media/Screenshot_6.jpg)

### 7. В подключенном MySQL репозитории создать базу данных “Друзья человека”.

mysql -u root -p

CREATE DATABASE humanFriendsdb;

### 8. Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения.

use `humanFriendsdb`;

#### Создаем низкоуровневые таблицы
CREATE TABLE cat (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45),
    Birthday DATE);


CREATE TABLE dog (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45),
    Birthday DATE);


CREATE TABLE hamster (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45),
    Birthday DATE);

CREATE TABLE horse (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	liftWeight INT,
    Name VARCHAR(45),
    Command VARCHAR(45),
	Birthday DATE);


CREATE TABLE camel (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	liftWeight INT,
    Name VARCHAR(45),
    Command VARCHAR(45),
	Birthday DATE);


CREATE TABLE donkey (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	liftWeight INT,
    Name VARCHAR(45),
    Command VARCHAR(45),
	Birthday DATE);

#### Создаем таблицы уровня выше

CREATE TABLE pet (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45),
    Birthday DATE);


CREATE TABLE packAnimal (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    liftWeight INT,
    Name VARCHAR(45),
    Command VARCHAR(45),
    Birthday DATE);

#### Создаем общую таблицу

CREATE TABLE humanFriend(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45),
    Birthday Date,
    Age FLOAT
    );

#### Заполняем данными низкоуровневые таблицы
    
INSERT INTO cat (Name, Command, Birthday) values
    ('Барсик', 'Спать', '2022-01-01'),
    ('Мурзик', 'Спать', '2017-06-06'),
	('Месси', 'Спать', '2023-01-06'),
    ('Мурка', 'Спать', '2021-03-17');
    
INSERT INTO dog (Name, Command, Birthday) values
    ('Полкан', 'Лежать', '2022-01-01'),
    ('Хатико', 'Лежать', '2017-06-06'),
	('Юта', 'Лежать', '2023-01-06'),
    ('Микки', 'Лежать', '2021-03-17');	

INSERT INTO hamster (Name, Command, Birthday) values
    ('Хома', 'Бежать', '2022-01-01'),
    ('Пушок', 'Бежать', '2017-06-06'),
	('Хомура', 'Бежать', '2023-01-06'),
    ('Генерал', 'Бежать', '2021-03-17');
     
INSERT INTO camel (Name, Command, LiftWeight, Birthday) values
    ('Агата', 'Поднять', 100, '2022-01-01'),
    ('Ида', 'Поднять', 200, '2017-06-06'),
	('Ланцелот', 'Поднять', 400, '2023-01-06'),
    ('Джаред', 'Поднять', 50, '2021-03-17');
     
INSERT INTO horse (Name, Command, liftWeight, Birthday) values
    ('Мерин', 'Галоп', 150, '2022-01-01'),
    ('Буран', 'Галоп', 50, '2017-06-06'),
	('Плотва', 'Галоп', 200, '2023-01-06'),
    ('Осман', 'Галоп', 250, '2021-03-17');
     
INSERT INTO donkey (Name, Command, liftWeight, Birthday) values
    ('Алдар', 'Жевать', 35, '2022-01-01'),
    ('Бригелла', 'Жевать', 10, '2017-06-06'),
	('Зигфрид', 'Жевать', 20, '2023-01-06'),
    ('Моисей', 'Жевать', 100, '2021-03-17');

### 10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.

DELETE FROM camel WHERE id > 0;

SELECT * FROM camel;

CREATE TABLE packAnimalNew (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY)
SELECT  Name, 
        Command, 
        Birthday
FROM horse UNION 
SELECT  Name, 
        Command, 
        Birthday
FROM donkey;

SELECT * FROM packAnimalNew;

### 11. Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице.

INSERT INTO pet (Name, Command, Birthday)
SELECT  Name, 
        Command, 
        Birthday
FROM cat UNION 
SELECT  Name, 
        Command, 
        Birthday
FROM dog UNION
SELECT  Name, 
        Command, 
        Birthday
FROM hamster;
SELECT * FROM pet;

INSERT INTO packAnimal (Name, Command, liftWeight, Birthday)
SELECT Name,
       Command,
       liftWeight,
       Birthday
FROM donkey UNION
SELECT Name,
       Command,
       liftWeight,
       Birthday
FROM horse UNION
SELECT Name,
       Command,
       liftWeight,
       Birthday
FROM camel;

INSERT INTO humanFriend (Name, Command, Birthday, Age)
SELECT  Name, 
        Command, 
        Birthday,
CASE
    WHEN MONTH(CURDATE())<MONTH(Birthday) THEN ROUND(((YEAR(CURDATE())-YEAR(Birthday))-(MONTH(CURDATE())-MONTH(Birthday))/10),1)
    ELSE ROUND(((YEAR(CURDATE())-YEAR(Birthday))-(MONTH(Birthday)-MONTH(CURDATE()))/10),1)
END AS Age
FROM pet UNION 
SELECT  Name, 
        Command, 
        Birthday,
CASE
    WHEN MONTH(CURDATE())<MONTH(Birthday) THEN ROUND(((YEAR(CURDATE())-YEAR(Birthday))-(MONTH(CURDATE())-MONTH(Birthday))/10),1)
    ELSE ROUND(((YEAR(CURDATE())-YEAR(Birthday))-(MONTH(Birthday)-MONTH(CURDATE()))/10),1)
END AS Age
FROM packAnimalNew;

SELECT * FROM humanFriend;

CREATE TABLE youngAnimals (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY)
SELECT Name,
       Command,
       Birthday,
       Age
FROM humanFriend
WHERE Age>1 AND Age<3;

SELECT * FROM youngAnimals;

![image](https://github.com/PIM89/FinalWork/blob/master/Media/Screenshot_7.jpg)

#### 12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.

CREATE TABLE newhumanFriend (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY)
SELECT  Name, 
        Command,
        Birthday,
        'cat' as oldTable
FROM cat UNION 
SELECT  Name, 
        Command, 
        Birthday,
        'dog' as oldTable
FROM dog UNION
SELECT  Name, 
        Command, 
        Birthday,
        'hamster' as oldTable
FROM hamster UNION 
SELECT  Name, 
        Command, 
        Birthday,
        'horse' as oldTable
FROM horse UNION 
SELECT  Name, 
        Command, 
        Birthday,
        'donkey' as oldTable
FROM donkey;

SELECT * FROM newhumanFriend;

![image](https://github.com/PIM89/FinalWork/blob/master/Media/Screenshot_8.jpg)

#### 14. Написать программу, имитирующую работу реестра домашних животных.
В программе должен быть реализован следующий функционал:
- 14.1 Завести новое животное
- 14.2 определять животное в правильный класс
- 14.3 увидеть список команд, которое выполняет животное
- 14.4 обучить животное новым командам
- 14.5 Реализовать навигацию по меню

#### 15. Написать программу, имитирующую работу реестра домашних животных.

Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆ значение внутренней̆ int переменной̆ на 1 при нажатии “Завести новое животное” Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources. Нужно бросить исключение, если работа с объектом типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение считать в ресурсе try, если при заведении животного заполнены все поля.

Ссылка на программу [здесь](https://github.com/PIM89/FinalWork/tree/master/registryPetJava/src).
