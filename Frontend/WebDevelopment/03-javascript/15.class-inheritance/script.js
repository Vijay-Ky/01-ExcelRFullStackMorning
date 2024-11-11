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
class Department extends Student
{
    constructor(name, stream)
    {
        super(name);
        this.stream = stream;
    }

    display()
    {
        return this.presentation() + ', and is from ' + this.stream;
    }
}

const student1 = new Department("vijay", "CSE");
document.write(student1.display());
