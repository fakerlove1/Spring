package com.ak.Pojo;

public class ExpressionTest {
    private String jdbc_url;
    private String password;
    private String code;
    private int id;
    private Boolean flag;
    private String email;
    private String telephone;
    private Double score;
    private Double price;
    private Boolean kk;

    public Boolean getKk() {
        return kk;
    }

    public void setKk(Boolean kk) {
        this.kk = kk;
    }

    @Override
    public String toString() {
        return "ExpressionTest{" +
                "jdbc_url='" + jdbc_url + '\'' +
                ", password='" + password + '\'' +
                ", code='" + code + '\'' +
                ", id=" + id +
                ", flag=" + flag +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", score=" + score +
                ", price=" + price +
                ", kk=" + kk +
                '}';
    }


    public String getJdbc_url() {
        return jdbc_url;
    }

    public void setJdbc_url(String jdbc_url) {
        this.jdbc_url = jdbc_url;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
