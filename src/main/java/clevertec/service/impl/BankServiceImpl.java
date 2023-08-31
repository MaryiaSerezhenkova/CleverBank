package clevertec.service.impl;

import clevertec.dao.BankDao;
import clevertec.domain.dto.BankDto;
import clevertec.domain.entity.Bank;
import clevertec.domain.mapper.impl.BankMapper;
import clevertec.service.BankService;

import java.util.List;

public class BankServiceImpl implements BankService {
    private final BankDao bankDao;
    private BankMapper bankMapper;

    public BankServiceImpl(BankDao bankDao, BankMapper bankMapper) {
        this.bankDao = bankDao;
    }

    @Override
    public List<Bank> getAll() {
        return bankDao.getAll();
    }

    @Override
    public BankDto create(BankDto item) {
        Bank bank = new Bank();
        bank.setDtCreate(item.getDtCreate());
        bank.setName(item.getName());
        return bankMapper.toDTO(bankDao.create(bank));
    }

    @Override
    public BankDto read(long id) {
        return bankMapper.toDTO(bankDao.get(id));
    }
}
