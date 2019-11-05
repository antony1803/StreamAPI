package by.courses.java.streamapi.entity;


@lombok.Data
@lombok.AllArgsConstructor(staticName = "of")
public class UserBase {
    private java.lang.String name;

    private int age;

    public java.lang.String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @java.lang.Override
    public boolean equals(java.lang.Object o) {
        if (!(o instanceof by.courses.java.streamapi.entity.UserBase))
            return false;

        if ((this) == o)
            return true;

        by.courses.java.streamapi.entity.UserBase userBase = ((by.courses.java.streamapi.entity.UserBase) (o));
        return ((age) == (userBase.age)) && (name.equals(userBase.name));
    }

    @java.lang.Override
    public int hashCode() {
        return java.util.Objects.hash(name, age);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return (((("UserBase : " + "name = ") + (name)) + ", age = ") + (age)) + ';';
    }
}

