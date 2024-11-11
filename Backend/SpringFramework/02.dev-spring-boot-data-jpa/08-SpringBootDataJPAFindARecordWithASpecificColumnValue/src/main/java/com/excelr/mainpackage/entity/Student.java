package com.excelr.mainpackage.entity;

import jakarta.persistence.*;

/*
The @Entity annotation in the Spring Framework is used to mark a Java class as an entity. An entity is a persistent object that is mapped to a table in a relational database. The @Entity annotation tells Spring Data JPA that the class should be managed by the persistence layer.

The @Entity annotation can be used on any Java class that meets the following requirements:

- The class must have a public no-argument constructor.
- The class must have a primary key.
- The class must have getter and setter methods for all of its properties.

why there should be a default constructor in the @Entity class??
- JPA requires all entity classes to have a default constructor. This is because JPA uses reflection to create instances of entity classes.
*/
@Entity
/*
- The @Table annotation in the Spring framework is used to specify the name of the database table that an entity class is mapped to. It is an optional annotation, but it is often used to override the default table name. The @Table annotation has the following attributes:
name: The name of the database table. This is the required attribute.
schema: The name of the database schema that the table belongs to.
 */
//@Table(name="student")
@Table(name = "student", schema = "student_tracker")
public class Student
{
    //define fields

    /*
    -The @Id annotation is used to mark the property that is the primary key of the entity. In this case, the primary key is the id property.
    - The @Id annotation can be used on any field type, but it is most commonly used on integer or long fields. The value of the primary key field must be unique for each row in the table.
    - When using the @Id annotation, you can also specify the generation strategy for the primary key value. The default generation strategy is auto-increment, which means that the database will automatically generate a unique value for each new row.
    */
    @Id
    /*
    - The @GeneratedValue annotation in the Spring framework is used to specify how the primary key value for an entity is generated. It is typically used in conjunction with the @Id annotation
    - IDENTITY - The database generates the primary key value automatically. This is the most common strategy for relational databases.
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*
    @Column annotation in the Spring framework is used to map a property of a Java object to a column in a database table
    - name: The name of the column in the database table.
    - length: The length of the column.
    - nullable: Whether the column can be null.
    - unique: Whether the value in the column must be unique.
    */
    @Column(name="id")
    //property, field, attribute
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    //define constructors

    public Student()
    {
    }

    public Student(String firstName, String lastName, String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    //define setters/getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //define toString method

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

