package clevertec.domain.mapper.impl;

import clevertec.domain.dto.AccountDto;
import clevertec.domain.entity.Account;

public class AccountMapper extends BaseMapper<Account, AccountDto> {
    @Override
    protected Class<Account> getEntityClass() {
        return Account.class;
    }

    @Override
    protected Class<AccountDto> getDtoClass() {
        return AccountDto.class;
    }
}
