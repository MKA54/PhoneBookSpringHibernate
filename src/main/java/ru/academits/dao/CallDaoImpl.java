package ru.academits.dao;

import org.springframework.stereotype.Repository;
import ru.academits.model.Call;

@Repository
public class CallDaoImpl extends CallGenericDaoImpl<Call, Long> implements CallDao{
    public CallDaoImpl() {
        super(Call.class);
    }
}