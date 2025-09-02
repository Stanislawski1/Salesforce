package dto;

import com.github.javafaker.Faker;

public class AccountFactory {

    public static Account getAccount(String type, String industry, String ownership) {
        Faker faker = new Faker();

        return Account.builder()
                .name(faker.name().name())
                .number(faker.phoneNumber().phoneNumber())
                .phone(faker.phoneNumber().cellPhone())
                .fax(faker.address().streetAddress())
                .site(faker.aviation().aircraft())
                .website(faker.animal().name())
                .Street(faker.artist().name())
                .street(faker.ancient().hero())
                .build();
    }
}