public class Author {
    private String firstName;
    private String secondName = "null";
    private String lastName;

    public Author(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toMerge() {
        String chek = "null";
        String toMerge;
        if (chek.equals(secondName)) {
            toMerge = firstName + " " + lastName;
        } else {
            toMerge = firstName + " " + secondName + " " + lastName;
        }
        return toMerge;
    }
    //на это не обращай, пожалуйста внимания, репетирую)
    /*public String toString() {
        String chek = "null";
        if (chek.equals(secondName)) {
            return this.firstName + " " + lastName+ ".";
        } else {
            return this.firstName + " " + this.secondName + " " + lastName + ". ";
        }
    }*/
}
