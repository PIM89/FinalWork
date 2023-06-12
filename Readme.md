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
create table cat (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45),
    Birthday DATE);


create table dog (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45),
    Birthday DATE);


create table hamster (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45),
    Birthday DATE);

create table horse (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	liftWeight INT,
    Name VARCHAR(45),
    Command VARCHAR(45),
	Birthday DATE);


create table camel (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	liftWeight INT,
    Name VARCHAR(45),
    Command VARCHAR(45),
	Birthday DATE);


create table donkey (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	liftWeight INT,
    Name VARCHAR(45),
    Command VARCHAR(45),
	Birthday DATE);

## Создаем таблицы уровня выше

create table pet (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(45),
    Command VARCHAR(45),
    Birthday DATE);


create table packAnimal (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    liftWeight INT,
    Name VARCHAR(45),
    Command VARCHAR(45),
    Birthday DATE);

#### Заполняем данными низкоуровневые таблицы
    
insert into cat (Name, Command, Birthday) values
    ('Барсик', 'Спать', '2022-01-01'),
    ('Мурзик', 'Спать', '2017-06-06'),
	('Месси', 'Спать', '2023-01-06'),
    ('Мурка', 'Спать', '2021-03-17');
    
insert into dog (Name, Command, Birthday) values
    ('Полкан', 'Лежать', '2022-01-01'),
    ('Хатико', 'Лежать', '2017-06-06'),
	('Юта', 'Лежать', '2023-01-06'),
    ('Микки', 'Лежать', '2021-03-17');	

insert into hamster (Name, Command, Birthday) values
    ('Хома', 'Бежать', '2022-01-01'),
    ('Пушок', 'Бежать', '2017-06-06'),
	('Хомура', 'Бежать', '2023-01-06'),
    ('Генерал', 'Бежать', '2021-03-17');
     
insert into camel (camelName, camelCommand, camelLiftWeight, camelBirthday) values
    ('Агата', 'Поднять', 100, '2022-01-01'),
    ('Ида', 'Поднять', 200, '2017-06-06'),
	('Ланцелот', 'Поднять', 400, '2023-01-06'),
    ('Джаред', 'Поднять', 50, '2021-03-17');
     
insert into horse (Name, Command, liftWeight, Birthday) values
    ('Мерин', 'Галоп', 150, '2022-01-01'),
    ('Буран', 'Галоп', 50, '2017-06-06'),
	('Плотва', 'Галоп', 200, '2023-01-06'),
    ('Осман', 'Галоп', 250, '2021-03-17');
     
insert into donkey (Name, Command, liftWeight, Birthday) values
    ('Алдар', 'Жевать', 35, '2022-01-01'),
    ('Бригелла', 'Жевать', 10, '2017-06-06'),
	('Зигфрид', 'Жевать', 20, '2023-01-06'),
    ('Моисей', 'Жевать', 100, '2021-03-17');

