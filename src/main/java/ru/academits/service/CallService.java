package ru.academits.service;

import org.springframework.stereotype.Service;
import ru.academits.dao.CallDao;
import ru.academits.model.Call;
import ru.academits.model.Contact;

@Service
public class CallService {
    public CallService(CallDao callDao) {
    }

    public void call(Contact contact) {
        Call call = new Call();

        contact.addCall(call);
    }
}