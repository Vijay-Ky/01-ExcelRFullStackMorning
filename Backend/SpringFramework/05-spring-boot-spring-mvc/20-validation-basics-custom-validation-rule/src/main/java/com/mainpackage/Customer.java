package com.mainpackage;

import com.mainpackage.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer
{
//   @NotNull is an annotation from the Java Bean Validation framework (javax.validation.constraints) that indicates that a particular field must not be null.
//if null value is encountered during validation, it will trigger a validation error with the message "is required".
    //@NotNull(message="it should not be blank")
    //must have a size (in the case of a string) of at least 3 characters.
    //If the size constraint is violated, it will trigger a validation error with the message "is required".
    @Size(min=3, message="please enter your first name with at least 3 characters")
    private String firstName = "";

    //@NotNull(message="it should not be blank")
    @Size(min=1, message="please enter your last name with at least 1 character")
    private String lastName = "";

    @Min(value=0, message="must be greater than or equal to zero")
    @Max(value=10, message="must be less than or equal to 10")
    @NotNull(message="is required")
    private int freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{6}", message = "no special characters & only 5 chars/digits")
    private String postalCode;

    @CourseCode(value="SPRING", message="must start with SPRING")
    private String courseCode;

    public String getCourseCode()
    {
        return courseCode;
    }

    public void setCourseCode(String courseCode)
    {
        this.courseCode = courseCode;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public void setPostalCode(String postalCode)
    {
        this.postalCode = postalCode;
    }

    public int getFreePasses()
    {
        return freePasses;
    }

    public void setFreePasses(int freePasses)
    {
        this.freePasses = freePasses;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
}
