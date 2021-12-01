package ru.academits.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "calls")
public class Call {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private int contactId;

    @ManyToOne
    @JoinColumn(name = "contactId")
    private Contact contact;

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }
}