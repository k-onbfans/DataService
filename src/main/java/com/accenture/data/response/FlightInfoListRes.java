package com.accenture.data.response;

import com.accenture.data.entity.FlightInfoEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class FlightInfoListRes {
    private List<FlightInfoEntity> list;
}
