package com.ak.Pojo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class D_4 {
    private List<String> list;
    private Set<String> set;
    private Map map;
    private Properties addressProp;

    @Override
    public String toString() {
        return "D_4{" +
                "list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", addressProp=" + addressProp +
                '}';
    }

    public Properties getAddressProp() {
        return addressProp;
    }

    public void setAddressProp(Properties addressProp) {
        this.addressProp = addressProp;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
}
