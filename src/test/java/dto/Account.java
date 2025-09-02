package dto;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Account {
    private String name;
    private String phone;
    private String fax;
    private String site;
    private String website;
    private String number;
    private String street;
    private String Street;
    private String type;
    private String industry;
    private String ownership;
    private Boolean vipClient;
    private Boolean teachMeSkills;
}