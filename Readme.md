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