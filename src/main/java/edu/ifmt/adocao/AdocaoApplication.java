package edu.ifmt.adocao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

import java.util.Locale;

@SpringBootApplication
public class AdocaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdocaoApplication.class, args);
	}

}
