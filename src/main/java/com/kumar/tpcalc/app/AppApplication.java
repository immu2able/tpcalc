package com.kumar.tpcalc.app;

import java.io.Console;
import java.util.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's identify the TharaPalan of your Nakshatram:");
			
			Scanner in = new Scanner(System.in);

			System.out.println("Enter your Nakshatram:");
			String n = in.nextLine();

			System.out.println("Enter today's Nakshatram: ");
			String t = in.nextLine();

			in.close();

			// Perform the tharapalan calculation here
			Map<Integer, String> taraPalanMap = new HashMap<>();
			taraPalanMap.put(-1, "Not Found");
			taraPalanMap.put(1, "Janma Thara");
			taraPalanMap.put(2, "Sampath Thara");
			taraPalanMap.put(3, "Vipath Thara");
			taraPalanMap.put(4, "Kshema Thara");
			taraPalanMap.put(5, "Prathyak Thara");
			taraPalanMap.put(6, "Sadaka Thara");
			taraPalanMap.put(7, "Vadha Thara");
			taraPalanMap.put(8, "Mithra Thara");
			taraPalanMap.put(9, "Athimithra Thara");
			
			List<String> nakshatrams = new ArrayList<>();
			String nakString = "Ashwini,Bharani,Kruthika,Rohini,Mrigashirsham,Ardra,Punarvasu,Pushyam,Ashlesham,Magham,Purva Phalguni,Uttara Phalguni,Hastam,Chitra,Svati,Vishakham,Anuradha,Jyeshtha,Mulam,Purva Ashadha,Uttara Asadha,Shravanam,Shravishtam,Sadhayam,Puratadhi,Uttaratadhi,Revati";
			StringTokenizer st = new StringTokenizer(nakString, ",");
			while (st.hasMoreTokens()) {
				nakshatrams.add(st.nextToken());
			}

			int un = nakshatrams.indexOf(n);
			int tn = nakshatrams.indexOf(t);

			System.out.println("User's Nakshatram found: " + un);
			System.out.println("Today's Nakshatram found: " + tn);
			int tpn = -1;

			if (un >= 0 && tn >= 0) {
				// adjusting for 0 indexed list
				un++;
				tn++;

				// if user nakshatram is smaller than behind today's nakshatram
				if (un <= tn) {
					int diff = tn - un;
					tpn = diff % 9;
				} else {
					int diff = 27 - un;
					diff = diff + tn;
					tpn = diff % 9;
				}

				tpn++;
			}
			System.out.println("Tara palan number: " + tpn);
			System.out.println("Your Nakshatram is: " + n + " and today's Nakshatram is: " + t + " and the tharapalan is: " + taraPalanMap.get(tpn));
		};
	}

}
