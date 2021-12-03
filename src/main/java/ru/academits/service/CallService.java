package ru.academits.service;

import org.springframework.stereotype.Service;
import ru.academits.dao.CallGenericDao;
import ru.academits.model.Call;
import ru.academits.model.Contact;

import java.sql.Timestamp;

@Service
public class CallService {
    private final CallGenericDao<Call, Long> callGenericDao;

    public CallService(CallGenericDao<Call, Long> callGenericDao) {
        this.callGenericDao = callGenericDao;
    }

    public void addCall(Contact contact) {
        Call call = new Call();
        call.setContactId(contact.getId());

        Timestamp date = new Timestamp(System.currentTimeMillis());
        call.setCallDate(date);

        callGenericDao.create(call);
    }
}