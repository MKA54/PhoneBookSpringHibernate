package ru.academits.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "calls")
public class Call {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "contactId")
    private Long contactId;

    @Column(name = "call_date")
    private Timestamp callDate;

    public Timestamp getCallDate() {
        return callDate;
    }

    public void setCallDate(Timestamp callDate) {
        this.callDate = callDate;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}