package clevertec.service.impl;

import clevertec.dao.AccountDao;
import clevertec.domain.dto.AccountDto;
import clevertec.domain.entity.Account;
import clevertec.domain.mapper.impl.AccountMapper;
import clevertec.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    private final AccountDao dao;
    private AccountMapper mapper;

    public AccountServiceImpl(AccountDao dao, AccountMapper accountMapper) {
        this.dao = dao;
    }

    @Override
    public AccountDto create(AccountDto item) {
        Account account = new Account();
        account.setDtCreate(item.getDtCreate());
        account.setIban(item.getIban());
        account.setCurrency(item.getCurrency());
        account.setBankId(item.getBankId());
        account.setUserId(item.getUserId());
        account.setAmount(item.getAmount());
        return mapper.toDTO(dao.create(account));
    }

    @Override
    public AccountDto read(long id) {
        return mapper.toDTO(dao.get(id));
    }

    @Override
    public List<Account> userAccounts(long userId) {
        return dao.userAccounts(userId);
    }

    @Override
    public List<Account> bankAccounts(long bankId) {
        return dao.bankAccounts(bankId);
    }
}
