package com.choongang.erpproject.accounting.dto;

import jdk.vm.ci.meta.Local;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class AccRequestDto {

    private int statNum; //전표번호
    private LocalDate statDate; //발생날짜
    private String expNum; //결의번호
    private String empId; //사번
}