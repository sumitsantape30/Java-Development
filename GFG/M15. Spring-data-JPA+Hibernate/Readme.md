Problems with previous Approach

Problems with ORM

1. We are converting Java object to SQL table ourselves.
  this is error prone: 
 2. we also store employee object into sql using query, this is also error prone.
 These 2 functions should be done automatically by some framework.
 Here you're doing Object Relation Mapping(ORM), there are lot of framework which does this task for us.
 
 3. Scalability: right now I had only 5 attributes so i was able to do getId() and then map it to Id, getAge() and then map it to age etc.
  what if i had 50 attributes. you wont be able to map 50 attirbutes with 50 columns.
 4. Optimization: you dont have guarantee that sql query you have written is most optimized.
 
 then Fameworks like eclipselink, hibernate, Open JPA, rowmapper comes into picture.
 Hibernate is a framework which we use to do ORM and JPA is spring related abstraction.
 so when we say we'll intergrate hibernate and jpa, jpa is basically an abstraction which is use to connect to hiberante to do above all the ORM.
 <br>
 Just getting the connection from the drivermanager and writing queries ourselves wont help us scale the application.
 <br>
 ORM: ORM is mapping our object of entity like Employee with the database.(relational database)
 
