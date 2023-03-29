Enter password: *********
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 9
Server version: 8.0.32 MySQL Community Server - GPL

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| sumitdb            |
| sys                |
+--------------------+
5 rows in set (0.20 sec)

mysql> create database springjdbc
    -> ;
Query OK, 1 row affected (0.03 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| springjdbc         |
| sumitdb            |
| sys                |
+--------------------+
6 rows in set (0.00 sec)

mysql> use springjdbc;
Database changed
mysql> create table Student(id int primary key, name varchar(100) not null, city varchar(100));
Query OK, 0 rows affected (0.06 sec)

mysql> show tables;
+----------------------+
| Tables_in_springjdbc |
+----------------------+
| student              |
+----------------------+
1 row in set (0.02 sec)

mysql> insert into student(id, name, city) values(222, 'sumit', "Nagpur");
Query OK, 1 row affected (0.04 sec)

mysql> select * from student;
+-----+-------+--------+
| id  | name  | city   |
+-----+-------+--------+
| 222 | sumit | Nagpur |
+-----+-------+--------+
1 row in set (0.00 sec)

mysql> desc student;
+-------+--------------+------+-----+---------+-------+
| Field | Type         | Null | Key | Default | Extra |
+-------+--------------+------+-----+---------+-------+
| id    | int          | NO   | PRI | NULL    |       |
| name  | varchar(100) | NO   |     | NULL    |       |
| city  | varchar(100) | YES  |     | NULL    |       |
+-------+--------------+------+-----+---------+-------+
3 rows in set (0.02 sec)

mysql>
