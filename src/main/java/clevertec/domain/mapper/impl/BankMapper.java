package clevertec.domain.mapper.impl;

import clevertec.domain.dto.BankDto;
import clevertec.domain.entity.Bank;

public class BankMapper extends BaseMapper<Bank, BankDto> {

    @Override
    protected Class<Bank> getEntityClass() {
        return Bank.class;
    }

    @Override
    protected Class<BankDto> getDtoClass() {
        return BankDto.class;
    }
}
