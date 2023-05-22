import java.util.Date;


    public class Employee implements Comparable<Employee>
    {
        String firstName;
        String lastName;

        @Override
        public String toString() {
            return "Employee{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
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




        public Employee(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }


        public int compareTo(Employee e)
        {
            int compareValue = this.firstName.compareTo(e.firstName);
            if (compareValue == 0)
            {
                return this.lastName.compareTo(e.lastName);
            }
            return compareValue;
        }
        }

