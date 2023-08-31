package clevertec.service;

import clevertec.domain.dto.BankDto;
import clevertec.domain.entity.Bank;

import java.util.List;

public interface BankService extends IService<Bank, BankDto> {
    List<Bank> getAll();
}
