class Student
{
    constructor(name, rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }
}
const student1 = new Student("vijay", 101);

document.write(student1.name + " " + student1.rollNo);