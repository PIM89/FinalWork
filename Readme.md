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

