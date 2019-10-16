package com.accenture.data.response;

import com.accenture.data.entity.FlightInfoEntity;

import java.util.List;


public class FlightInfoListRes {
    private List<FlightInfoEntity> list;

    public List<FlightInfoEntity> getList() {
        return list;
    }

    public void setList(List<FlightInfoEntity> list) {
        this.list = list;
    }
}
