package edu.bbte.idde.bmim2214.controller.dto.outdto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class CarDtoOut extends CarShortDtoOut {
    private int year;
    private double price;
    private Date uploadDate;
    private List<CarExtraDtoOut> extras;
}
