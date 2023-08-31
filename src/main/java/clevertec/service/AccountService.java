package clevertec.service;

import clevertec.domain.dto.AccountDto;
import clevertec.domain.entity.Account;

import java.util.List;

public interface AccountService extends IService<Account, AccountDto> {

    List<Account> userAccounts(long userId);
    List<Account> bankAccounts(long bankId);
}
