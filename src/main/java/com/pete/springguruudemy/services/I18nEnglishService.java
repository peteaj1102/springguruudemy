package com.pete.springguruudemy.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Petea on 16:32 28 Aug, 2020
 */
@Profile("EN")
@Service("i18nService")
public class I18nEnglishService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello Word -EN";
    }
}
