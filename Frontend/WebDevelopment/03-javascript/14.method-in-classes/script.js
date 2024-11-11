class Student
{
    constructor(name, rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }

    presentation()
    {
        return 'Student ' + this.name + ' has given presenetation';
    }
}
const student1 = new Student("vijay", 101);
document.write(student1.name + " " + student1.rollNo);
document.write("<br>"); // Adding a line break
document.write(student1.presentation());
