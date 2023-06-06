package com.nativeQuery;

import com.nativeQuery.Model.Company;
import com.nativeQuery.Repository.CompanyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;


@SpringBootApplication
public class NativeQueryAndJpqlApplication implements CommandLineRunner {


	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(NativeQueryAndJpqlApplication.class, args);
		CompanyRepository companyRepository = context.getBean(CompanyRepository.class);
		List<Company> companyDeatils = companyRepository.getCompanyDeatils();
		companyDeatils.forEach(e->{
			System.out.println(e);
		});

		List<Company> companyById = companyRepository.getCompanyById(1);
		companyById.forEach(e->{
			System.out.println(e);
		});
	}


	@Override
	public void run(String... args) {
		System.out.println("Command Line Runner ...");
	}
}
