package edu;

public class Professor extends Person {
    private String rank;

    public Professor(String firstName, String lastName, String rank, String nationalCode) {
        super(firstName, lastName, nationalCode);
        this.rank = rank;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }

    @Override
    public void receiveLoan() {
        loanReceived += Person.LOAN_AMOUNT_PROFESSOR;
    }

    @Override
    public String getType() {
        return "Professor";
    }
}
