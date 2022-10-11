package com.choongang.erpproject.account;

import com.choongang.erpproject.accounting.dto.AccRequestDto;
import com.choongang.erpproject.accounting.dto.AccResponseDto;
import com.choongang.erpproject.accounting.mapper.AccMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class AccMapperTest {

    @Autowired
    AccMapper accMapper;

    @Test
    void InsertTest() {
        AccRequestDto accRequestDto = new AccRequestDto();

        accRequestDto.setStatNum(3);
        accRequestDto.setStatDate(LocalDate.now());
        accRequestDto.setExpNum("SJCD-0187");
        accRequestDto.setEmpId("SJ-0074");

        accMapper.insertAccInfo(accRequestDto);

        List<AccResponseDto> data = accMapper.getAccList();
        System.out.println("전체 개시글 수 : " + data.size() + "건");
    }

    @Test
    void getExpNum() {

        Long num = 1L;

        String expNum = accMapper.getExpNum(num);

        System.out.println("전표번호(statNum)는 " + num + "이고 이에 해당하는 결의번호(expNum)는 " + expNum);

    }

}