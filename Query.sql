Enter password: ********
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 29
Server version: 8.0.41 MySQL Community Server - GPL

Copyright (c) 2000, 2025, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use query;
Database changed
mysql> create table product(product_id varchar(10) not null primary key,product_name varchar(50) not null,category varchar(50)not null,subcategory varchar(50) not null,original_price double not null,selling_price double not null,stock int not null);
Query OK, 0 rows affected (0.13 sec)

mysql> desc product;
+----------------+-------------+------+-----+---------+-------+
| Field          | Type        | Null | Key | Default | Extra |
+----------------+-------------+------+-----+---------+-------+
| product_id     | varchar(10) | NO   | PRI | NULL    |       |
| product_name   | varchar(50) | NO   |     | NULL    |       |
| category       | varchar(50) | NO   |     | NULL    |       |
| subcategory    | varchar(50) | NO   |     | NULL    |       |
| original_price | double      | NO   |     | NULL    |       |
| selling_price  | double      | NO   |     | NULL    |       |
| stock          | int         | NO   |     | NULL    |       |
+----------------+-------------+------+-----+---------+-------+
7 rows in set (0.02 sec)

mysql> insert into product(product_id, product_name, category, subcategory,original_price,selling_price,stock) values('P101','Television','Electronic','phone',50000,40000,100),('P102','Chair','Furniture','chairs',1000,700,15),('P103','Samsung Galaxy','Electronices','Phone',60000,50000,70);
Query OK, 3 rows affected (0.04 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> select *from product;
+------------+----------------+--------------+-------------+----------------+---------------+-------+
| product_id | product_name   | category     | subcategory | original_price | selling_price | stock |
+------------+----------------+--------------+-------------+----------------+---------------+-------+
| P101       | Television     | Electronic   | phone       |          50000 |         40000 |   100 |
| P102       | Chair          | Furniture    | chairs      |           1000 |           700 |    15 |
| P103       | Samsung Galaxy | Electronices | Phone       |          60000 |         50000 |    70 |
+------------+----------------+--------------+-------------+----------------+---------------+-------+
3 rows in set (0.00 sec)

mysql> select product_id,product_name,stock from product;
+------------+----------------+-------+
| product_id | product_name   | stock |
+------------+----------------+-------+
| P101       | Television     |   100 |
| P102       | Chair          |    15 |
| P103       | Samsung Galaxy |    70 |
+------------+----------------+-------+
3 rows in set (0.00 sec)

mysql> select product_id,product_name,stock from product;
+------------+----------------+-------+
| product_id | product_name   | stock |
+------------+----------------+-------+
| P101       | Television     |   100 |
| P102       | Chair          |    15 |
| P103       | Samsung Galaxy |    70 |
+------------+----------------+-------+
3 rows in set (0.00 sec)

mysql> select *from product  where product_name LIKE 'S%';
+------------+----------------+--------------+-------------+----------------+---------------+-------+
| product_id | product_name   | category     | subcategory | original_price | selling_price | stock |
+------------+----------------+--------------+-------------+----------------+---------------+-------+
| P103       | Samsung Galaxy | Electronices | Phone       |          60000 |         50000 |    70 |
+------------+----------------+--------------+-------------+----------------+---------------+-------+
1 row in set (0.00 sec)

mysql> select *from product  where subcategory LIKE '%e';
+------------+----------------+--------------+-------------+----------------+---------------+-------+
| product_id | product_name   | category     | subcategory | original_price | selling_price | stock |
+------------+----------------+--------------+-------------+----------------+---------------+-------+
| P101       | Television     | Electronic   | phone       |          50000 |         40000 |   100 |
| P103       | Samsung Galaxy | Electronices | Phone       |          60000 |         50000 |    70 |
+------------+----------------+--------------+-------------+----------------+---------------+-------+
2 rows in set (0.00 sec)

mysql> select *from product  where subcategory LIKE '%air%';
+------------+--------------+-----------+-------------+----------------+---------------+-------+
| product_id | product_name | category  | subcategory | original_price | selling_price | stock |
+------------+--------------+-----------+-------------+----------------+---------------+-------+
| P102       | Chair        | Furniture | chairs      |           1000 |           700 |    15 |
+------------+--------------+-----------+-------------+----------------+---------------+-------+
1 row in set (0.00 sec)

mysql> select *from product  where product_name LIKE 'C__' ;
Empty set (0.00 sec)

mysql> select *from product  where product_name LIKE 'T_____' ;
Empty set (0.00 sec)

mysql> select *from product;
+------------+----------------+--------------+-------------+----------------+---------------+-------+
| product_id | product_name   | category     | subcategory | original_price | selling_price | stock |
+------------+----------------+--------------+-------------+----------------+---------------+-------+
| P101       | Television     | Electronic   | phone       |          50000 |         40000 |   100 |
| P102       | Chair          | Furniture    | chairs      |           1000 |           700 |    15 |
| P103       | Samsung Galaxy | Electronices | Phone       |          60000 |         50000 |    70 |
+------------+----------------+--------------+-------------+----------------+---------------+-------+
3 rows in set (0.00 sec)

mysql> select *from product where original_price >50000;
+------------+----------------+--------------+-------------+----------------+---------------+-------+
| product_id | product_name   | category     | subcategory | original_price | selling_price | stock |
+------------+----------------+--------------+-------------+----------------+---------------+-------+
| P103       | Samsung Galaxy | Electronices | Phone       |          60000 |         50000 |    70 |
+------------+----------------+--------------+-------------+----------------+---------------+-------+
1 row in set (0.01 sec)

mysql> select *from product where original_price >=50000;
+------------+----------------+--------------+-------------+----------------+---------------+-------+
| product_id | product_name   | category     | subcategory | original_price | selling_price | stock |
+------------+----------------+--------------+-------------+----------------+---------------+-------+
| P101       | Television     | Electronic   | phone       |          50000 |         40000 |   100 |
| P103       | Samsung Galaxy | Electronices | Phone       |          60000 |         50000 |    70 |
+------------+----------------+--------------+-------------+----------------+---------------+-------+
2 rows in set (0.00 sec)

mysql> select *from product  where product_name LIKE 'Cha__' ;
+------------+--------------+-----------+-------------+----------------+---------------+-------+
| product_id | product_name | category  | subcategory | original_price | selling_price | stock |
+------------+--------------+-----------+-------------+----------------+---------------+-------+
| P102       | Chair        | Furniture | chairs      |           1000 |           700 |    15 |
+------------+--------------+-----------+-------------+----------------+---------------+-------+
1 row in set (0.00 sec)
mysql> select *from product  where product_name LIKE 'Chai_' ;
+------------+--------------+-----------+-------------+----------------+---------------+-------+
| product_id | product_name | category  | subcategory | original_price | selling_price | stock |
+------------+--------------+-----------+-------------+----------------+---------------+-------+
| P102       | Chair        | Furniture | chairs      |           1000 |           700 |    15 |
+------------+--------------+-----------+-------------+----------------+---------------+-------+
1 row in set (0.00 sec)

mysql> create table emp(ID varchar(5)not null primary key,NAME varchar(20) not null,SALARY int not null);
Query OK, 0 rows affected (0.11 sec)


mysql> insert into emp values('E1','SAI',10000);
Query OK, 1 row affected (0.01 sec)

mysql> insert into emp values('E2','RAM',20000);
Query OK, 1 row affected (0.00 sec)

mysql> insert into emp values('E3','SAGAR',50000);
Query OK, 1 row affected (0.00 sec)

mysql> insert into emp values('E4','ROHIT',60000);
Query OK, 1 row affected (0.02 sec)

mysql> select *from emp;
+----+-------+--------+
| ID | NAME  | SALARY |
+----+-------+--------+
| E1 | SAI   |  10000 |
| E2 | RAM   |  20000 |
| E3 | SAGAR |  50000 |
| E4 | ROHIT |  60000 |
+----+-------+--------+
4 rows in set (0.00 sec)

mysql> delete from emp where ID='E3';
Query OK, 1 row affected (0.01 sec)

mysql> select *from emp;
+----+-------+--------+
| ID | NAME  | SALARY |
+----+-------+--------+
| E1 | SAI   |  10000 |
| E2 | RAM   |  20000 |
| E4 | ROHIT |  60000 |
+----+-------+--------+
3 rows in set (0.00 sec)

mysql> delete from emp where SALARY>60000;
Query OK, 0 rows affected (0.00 sec)

mysql> select *from emp;
+----+-------+--------+
| ID | NAME  | SALARY |
+----+-------+--------+
| E1 | SAI   |  10000 |
| E2 | RAM   |  20000 |
| E4 | ROHIT |  60000 |
+----+-------+--------+
3 rows in set (0.00 sec)

mysql> delete from emp where SALARY<60000;
Query OK, 2 rows affected (0.00 sec)

mysql> select *from emp;
+----+-------+--------+
| ID | NAME  | SALARY |
+----+-------+--------+
| E4 | ROHIT |  60000 |
+----+-------+--------+
1 row in set (0.00 sec)

mysql> select *from product;
+------------+----------------+--------------+-------------+----------------+---------------+-------+
| product_id | product_name   | category     | subcategory | original_price | selling_price | stock |
+------------+----------------+--------------+-------------+----------------+---------------+-------+
| P101       | Television     | Electronic   | phone       |          50000 |         40000 |   100 |
| P102       | Chair          | Furniture    | chairs      |           1000 |           700 |    15 |
| P103       | Samsung Galaxy | Electronices | Phone       |          60000 |         50000 |    70 |
+------------+----------------+--------------+-------------+----------------+---------------+-------+
3 rows in set (0.00 sec)

mysql> update product set original_price=1500 where product_id='P102';
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select *from product;
+------------+----------------+--------------+-------------+----------------+---------------+-------+
| product_id | product_name   | category     | subcategory | original_price | selling_price | stock |
+------------+----------------+--------------+-------------+----------------+---------------+-------+
| P101       | Television     | Electronic   | phone       |          50000 |         40000 |   100 |
| P102       | Chair          | Furniture    | chairs      |           1500 |           700 |    15 |
| P103       | Samsung Galaxy | Electronices | Phone       |          60000 |         50000 |    70 |
+------------+----------------+--------------+-------------+----------------+---------------+-------+
3 rows in set (0.00 sec)

mysql> update product set stock=90 where product_id='P103';
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select *from product;
+------------+----------------+--------------+-------------+----------------+---------------+-------+
| product_id | product_name   | category     | subcategory | original_price | selling_price | stock |
+------------+----------------+--------------+-------------+----------------+---------------+-------+
| P101       | Television     | Electronic   | phone       |          50000 |         40000 |   100 |
| P102       | Chair          | Furniture    | chairs      |           1500 |           700 |    15 |
| P103       | Samsung Galaxy | Electronices | Phone       |          60000 |         50000 |    90 |
+------------+----------------+--------------+-------------+----------------+---------------+-------+
3 rows in set (0.00 sec)
