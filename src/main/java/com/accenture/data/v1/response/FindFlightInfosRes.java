package com.accenture.data.v1.response;

import java.util.List;

public class FindFlightInfosRes {
    private List<FindFlightInfoRes> list;

    public FindFlightInfosRes(List<FindFlightInfoRes> list) {
        this.list = list;
    }

    public FindFlightInfosRes() {}

    public List<FindFlightInfoRes> getList() {
        return list;
    }

    public void setList(List<FindFlightInfoRes> list) {
        this.list = list;
    }
}
