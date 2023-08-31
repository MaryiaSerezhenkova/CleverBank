package clevertec.dao;

import clevertec.domain.entity.Bank;


import java.time.LocalDateTime;
import java.util.List;

public interface BankDao {

    Bank create (Bank bank);
    Bank get (long id);
    List<Bank> getAll();
}
