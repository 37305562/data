package service.customer;

import service.account.Account;
import service.data.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The {@link Customer} entity is a root object in the customer bounded context.
 *
 * @author Kenny Bastani
 * @author Josh Long
 */
@Entity
public class Customer extends BaseEntity implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Account account;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String email, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.account = account;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    @OneToOne(cascade = CascadeType.ALL)
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", account=" + account +
                '}';
    }
}
